// Generated from ReactionString.g4 by ANTLR 4.2
package master.model.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReactionStringLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, NZINT=8, NAME=9, 
		WHITESPACE=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "']'", "','", "'+'", "'['", "':'", "'0'", "NZINT", "NAME", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NZINT", "D", 
		"NZD", "NAME", "WHITESPACE"
	};


	public ReactionStringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReactionString.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fC\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\7\t-\n\t\f\t\16\t\60\13\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\7\f8\n\f\f\f\16\f;\13\f\3\r\6\r>\n\r\r\r\16\r?\3\r\3\r\2\2\16\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\13\31\f\3\2\7\3\2\62;\3\2\63"+
		";\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"C\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7 \3\2\2\2\t"+
		"\"\3\2\2\2\13$\3\2\2\2\r&\3\2\2\2\17(\3\2\2\2\21*\3\2\2\2\23\61\3\2\2"+
		"\2\25\63\3\2\2\2\27\65\3\2\2\2\31=\3\2\2\2\33\34\7/\2\2\34\35\7@\2\2\35"+
		"\4\3\2\2\2\36\37\7_\2\2\37\6\3\2\2\2 !\7.\2\2!\b\3\2\2\2\"#\7-\2\2#\n"+
		"\3\2\2\2$%\7]\2\2%\f\3\2\2\2&\'\7<\2\2\'\16\3\2\2\2()\7\62\2\2)\20\3\2"+
		"\2\2*.\5\25\13\2+-\5\23\n\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\22\3\2\2\2\60.\3\2\2\2\61\62\t\2\2\2\62\24\3\2\2\2\63\64\t\3\2\2\64"+
		"\26\3\2\2\2\659\t\4\2\2\668\t\5\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:\30\3\2\2\2;9\3\2\2\2<>\t\6\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AB\b\r\2\2B\32\3\2\2\2\6\2.9?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}