package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import android.os.SystemClock;
import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92250l;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92251m;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4541l.C59336s;
import com.google.common.p4541l.C59337t;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66432l;
import com.google.speech.p5195a.p5196a.C66435o;
import com.google.speech.p5195a.p5196a.C66436p;
import com.google.speech.p5195a.p5196a.C66437q;
import com.google.speech.p5195a.p5196a.C66446z;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.a */
/* compiled from: PG */
public final class C94043a implements C94057o {

    /* renamed from: b */
    private static final C59071e f262688b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aq.a.a");

    /* renamed from: a */
    String f262689a;

    /* renamed from: c */
    private final C92248j f262690c;

    /* renamed from: d */
    private final C94051i f262691d;

    /* renamed from: e */
    private final C94060r f262692e;

    /* renamed from: f */
    private final C92249k f262693f;

    /* renamed from: g */
    private final MessageDigest f262694g;

    public C94043a(C92248j jVar, C94051i iVar, C94060r rVar, C92249k kVar, MessageDigest messageDigest) {
        C58838bb.m90868c(kVar != C92249k.CONTACT_NAMES);
        this.f262690c = jVar;
        this.f262691d = iVar;
        this.f262692e = rVar;
        this.f262693f = kVar;
        this.f262694g = messageDigest;
    }

    /* renamed from: a */
    public final C66422b mo88310a(String str) {
        StringBuilder sb;
        InputStreamReader inputStreamReader;
        C58838bb.m90883r(this.f262690c.mo86932k());
        if (!"en-US".equals(str)) {
            return null;
        }
        if (this.f262690c.mo86923a(str) == null) {
            C59104x c = f262688b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AbnfGrammarCompiler");
            ((C59052c) ((C59052c) c).mo56372aa(19449)).mo56389s("Grammar compilation failed, no resources for locale :%s", str);
            return null;
        }
        try {
            C94060r rVar = this.f262692e;
            C92249k kVar = this.f262693f;
            str.getClass();
            int identifier = rVar.f262728b.getIdentifier(str.replace('-', '_').toLowerCase(Locale.US) + "_" + kVar.f257209i, "raw", rVar.f262727a);
            if (identifier != 0) {
                sb = new StringBuilder(524288);
                try {
                    inputStreamReader = new InputStreamReader(rVar.f262728b.openRawResource(identifier));
                    try {
                        C59336s.m92219b(inputStreamReader, sb);
                        C59337t.m92222b(inputStreamReader);
                    } catch (IOException e) {
                        e = e;
                        try {
                            throw new C90457d((Throwable) e, (int) C89885b.GRECO_GRAMMAR_LOADER_READ_FAILED_VALUE);
                        } catch (Throwable th) {
                            th = th;
                            C59337t.m92222b(inputStreamReader);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamReader = null;
                    throw new C90457d((Throwable) e, (int) C89885b.GRECO_GRAMMAR_LOADER_READ_FAILED_VALUE);
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                    C59337t.m92222b(inputStreamReader);
                    throw th;
                }
            } else {
                sb = null;
            }
            if (sb == null) {
                return null;
            }
            if (this.f262693f.f257210j) {
                List<C94049g> a = this.f262691d.mo88316a();
                C94047e eVar = new C94047e();
                for (C94049g gVar : a) {
                    C58976aa aaVar = C58975e.f156826a;
                    String str2 = gVar.f262700b;
                    eVar.f262697a.add(gVar);
                }
                Collection<C94052j> a2 = eVar.mo88313a();
                if (a2.isEmpty()) {
                    sb.append("$TARGET = $VOID;\n$VOICE_DIALING = $DIGIT_DIALING;\n");
                } else {
                    sb.append("$TARGET = $CONTACT;\n$VOICE_DIALING = $CONTACT_AND_DIGIT_DIALING;\n$CONTACT = ");
                    boolean z = true;
                    for (C94052j jVar : a2) {
                        if (!z) {
                            sb.append(" | ");
                        }
                        C94052j.f262712a.setLength(0);
                        C94052j.f262713b.format("%f", new Object[]{Double.valueOf(jVar.f262715d)});
                        String sb2 = C94052j.f262712a.toString();
                        sb.append("(/");
                        sb.append(sb2);
                        sb.append("/ ");
                        sb.append(jVar.f262714c);
                        sb.append(" {XX_");
                        sb.append(sb2.replace('.', 'P'));
                        sb.append("_");
                        sb.append(Base64.encodeToString(jVar.f262714c.getBytes(), 11));
                        sb.append("})");
                        z = false;
                    }
                    sb.append(";\n");
                }
            }
            this.f262689a = sb.toString();
            C58976aa aaVar2 = C58975e.f156826a;
            C66421a aVar = (C66421a) C66422b.f180605k.createBuilder();
            MessageDigest messageDigest = this.f262694g;
            if (messageDigest != null) {
                messageDigest.reset();
                String encodeToString = Base64.encodeToString(this.f262694g.digest(this.f262689a.getBytes(Charset.forName("UTF-8"))), 11);
                C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
                C66436p pVar = (C66436p) C66437q.f180645b.createBuilder();
                C66432l lVar = (C66432l) C66435o.f180640d.createBuilder();
                lVar.copyOnWrite();
                C66435o oVar = (C66435o) lVar.instance;
                encodeToString.getClass();
                oVar.f180642a = 1 | oVar.f180642a;
                oVar.f180643b = encodeToString;
                pVar.mo59627a(lVar);
                cVar.copyOnWrite();
                C66446z zVar = (C66446z) cVar.instance;
                C66437q qVar = (C66437q) pVar.build();
                qVar.getClass();
                zVar.f180671g = qVar;
                zVar.f180665a |= 128;
                aVar.mo59623b(cVar);
            } else {
                aVar.mo59624c(C66446z.f180663j);
            }
            return (C66422b) aVar.build();
        } catch (IOException e3) {
            C59104x c2 = f262688b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AbnfGrammarCompiler");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(19448)).mo56386p("I/O Exception reading ABNF grammar: ");
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo88311b(C66422b bVar, String str, File file, File file2) {
        C58838bb.m90883r(this.f262690c.mo86932k());
        C92260v a = this.f262690c.mo86923a(str);
        boolean z = false;
        if (a == null) {
            C59104x c = f262688b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AbnfGrammarCompiler");
            ((C59052c) ((C59052c) c).mo56372aa(19451)).mo56389s("Grammar compilation failed, no resources for locale :%s", str);
            return false;
        } else if (this.f262689a == null) {
            return false;
        } else {
            C90762bf b = C90762bf.m148259b();
            String b2 = a.mo86941b(C92252n.COMPILER);
            String str2 = a.f257243g;
            C92250l lVar = new C92250l();
            try {
                if (lVar.mo59641c(new C59315ac(new File(b2)).mo56803a(), new String[]{str2})) {
                    String str3 = this.f262689a;
                    String absolutePath = file.getAbsolutePath();
                    String absolutePath2 = file2.getAbsolutePath();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (!lVar.mo59642d(absolutePath2)) {
                        ((C59052c) ((C59052c) C92251m.f257214a.mo56225c()).mo56372aa(12315)).mo56389s("Error reading cache file: %s", absolutePath2);
                    }
                    if (lVar.mo59640b(str3) && lVar.mo59643e(String.valueOf(absolutePath).concat("/grammar_clg"), String.valueOf(absolutePath).concat("/grammar_symbols")) && lVar.mo59644f(String.valueOf(absolutePath).concat("/semantic_fst"), String.valueOf(absolutePath).concat("/semantic_symbols"))) {
                        if (!lVar.mo59646g(absolutePath2)) {
                            ((C59052c) ((C59052c) C92251m.f257214a.mo56225c()).mo56372aa(12314)).mo56389s("Error writing cache to: %s", absolutePath2);
                        } else {
                            ((C59052c) ((C59052c) C92251m.f257214a.mo56224b()).mo56372aa(12313)).mo56389s("Compilation complete, time = %g s", Float.valueOf(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / 1000.0f));
                        }
                        z = true;
                    }
                    lVar.mo59639a();
                    if (z) {
                        C59104x b3 = f262688b.mo56224b();
                        b3.mo56378ag(C58975e.f156826a, "AbnfGrammarCompiler");
                        ((C59052c) ((C59052c) b3).mo56372aa(19450)).mo56388r("Compiled grammar : %d ms", b.mo85102a());
                    }
                    return z;
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C92251m.f257214a.mo56226d()).mo56382g(e)).mo56372aa(12316)).mo56386p("I/O Exception reading binary config file");
            }
            return false;
        }
    }
}
