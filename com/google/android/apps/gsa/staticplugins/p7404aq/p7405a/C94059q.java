package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.speech.p5195a.p5196a.C66422b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.q */
/* compiled from: PG */
public final class C94059q implements C94057o {

    /* renamed from: a */
    private static final C59071e f262724a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aq.a.q");

    /* renamed from: b */
    private final C94055m f262725b;

    /* renamed from: c */
    private final C92248j f262726c;

    public C94059q(C94055m mVar, C92248j jVar) {
        this.f262725b = mVar;
        this.f262726c = jVar;
    }

    /* renamed from: a */
    public final C66422b mo88310a(String str) {
        return this.f262725b.mo88310a(str);
    }

    /* renamed from: b */
    public final boolean mo88311b(C66422b bVar, String str, File file, File file2) {
        C94058p pVar = new C94058p();
        C92260v a = this.f262726c.mo86923a(str);
        if (a == null) {
            C59104x d = f262724a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TerseContextCompiler");
            ((C59052c) ((C59052c) d).mo56372aa(19487)).mo56389s("Resources are null for locale: %s.", str);
            int i = C90755l.f253831a;
            return false;
        }
        String b = a.mo86941b(C92252n.VOICE_ACTIONS_COMPILER);
        String[] strArr = {a.f257243g};
        if (b != null) {
            try {
                if (pVar.mo59636c(new C59315ac(new File(b)).mo56803a(), strArr)) {
                    boolean b2 = pVar.mo59635b(bVar.toByteArray(), file.getAbsolutePath(), file2.getAbsolutePath());
                    pVar.mo59634a();
                    return b2;
                }
            } catch (IOException e) {
                C59104x c = f262724a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TerseContextCompiler");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19486)).mo56386p("I/O Exception reading config file");
            }
            C59104x c2 = f262724a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "TerseContextCompiler");
            ((C59052c) ((C59052c) c2).mo56372aa(19485)).mo56386p("Compiler failed to init. ");
            pVar.mo59634a();
            return false;
        }
        C59104x c3 = f262724a.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "TerseContextCompiler");
        ((C59052c) ((C59052c) c3).mo56372aa(19484)).mo56386p("Failed to find config file.");
        return false;
    }
}
