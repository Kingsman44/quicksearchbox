package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.c */
/* compiled from: PG */
final class C116874c extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C116875d f324362a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116874c(C116875d dVar) {
        super("sb.v.u.BrainSource", "loadBrainSuggestDecoder", 2, 8);
        this.f324362a = dVar;
    }

    public final void run() {
        int i;
        try {
            C58976aa aaVar = C58975e.f156826a;
            C116875d dVar = this.f324362a;
            BrainSuggestDecoder brainSuggestDecoder = new BrainSuggestDecoder(dVar.f324364b, dVar.f324366d, ((float) ((int) dVar.f324365c.mo79743a(C90085ej.f250229g))) / 1000.0f);
            if (brainSuggestDecoder.f324357d.booleanValue()) {
                i = brainSuggestDecoder.initializeDecoder(brainSuggestDecoder.f324355b + File.separator + "brainsuggest.fb", brainSuggestDecoder.f324355b + File.separator + "multichar.txt");
            } else {
                i = brainSuggestDecoder.initializeDecoder(brainSuggestDecoder.f324355b + File.separator + "tensors.bin");
            }
            if (i == 0) {
                String str = brainSuggestDecoder.f324355b + File.separator + "extras.bin";
                if (new File(str).exists()) {
                    brainSuggestDecoder.initializeBlacklist(str);
                }
                synchronized (this.f324362a) {
                    this.f324362a.f324367e = brainSuggestDecoder;
                }
                return;
            }
            C59104x c = C116875d.f324363a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.v.u.BrainSource");
            ((C59052c) ((C59052c) c).mo56372aa(32477)).mo56386p("BrainSuggestDecoder initialization error.");
        } catch (UnsatisfiedLinkError e) {
            C59104x c2 = C116875d.f324363a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "sb.v.u.BrainSource");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32478)).mo56386p("BrainSuggestDecoder native library loading error.");
        }
    }
}
