package com.google.android.apps.gsa.shared.speech.hotword;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.search.p3055n.C39813q;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.f */
/* compiled from: PG */
public final /* synthetic */ class C90589f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C90590g f253261a;

    /* renamed from: b */
    public final /* synthetic */ String f253262b = "hotword_model_config";

    public /* synthetic */ C90589f(C90590g gVar) {
        this.f253261a = gVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C90590g gVar = this.f253261a;
        String str = this.f253262b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            C59104x c = C90590g.f253263a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
            ((C59052c) ((C59052c) c).mo56372aa(11131)).mo56389s("Missing client file group %s", "apa_hotword_model_config");
            return Optional.empty();
        }
        C58976aa aaVar = C58975e.f156826a;
        for (C28595b bVar : fVar.f80416g) {
            if (bVar.f77798b.equals(str)) {
                C59104x b = C90590g.f253263a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
                ((C59052c) ((C59052c) b).mo56372aa(11127)).mo56352E("Loading %s from MDD with version=%d", str, fVar.f80414e);
                Uri parse = Uri.parse(bVar.f77799c);
                try {
                    optional = Optional.m71637of(gVar.f253264b.mo45889c(parse, new C42789m(C39813q.f104698b.getParserForType())));
                } catch (IOException e) {
                    C59104x d = C90590g.f253263a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11133)).mo56389s("Failed to open uri: %s", parse);
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    return optional;
                }
                C59104x c2 = C90590g.f253263a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
                ((C59052c) ((C59052c) c2).mo56372aa(11128)).mo56389s("Hotword model config %s file can't be read.", str);
                return optional;
            }
        }
        C59104x c3 = C90590g.f253263a.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
        ((C59052c) ((C59052c) c3).mo56372aa(11126)).mo56389s("Hotword model config %s file not found.", str);
        return Optional.empty();
    }
}
