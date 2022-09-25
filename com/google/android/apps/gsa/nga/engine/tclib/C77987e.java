package com.google.android.apps.gsa.nga.engine.tclib;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82438fe;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82667nr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82668ns;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61905bo;
import java.io.IOException;
import java.util.HashSet;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.e */
/* compiled from: PG */
public final /* synthetic */ class C77987e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ TcLibWrapper f214776a;

    /* renamed from: b */
    public final /* synthetic */ C29690f f214777b;

    /* renamed from: c */
    public final /* synthetic */ String f214778c;

    public /* synthetic */ C77987e(TcLibWrapper tcLibWrapper, C29690f fVar, String str) {
        this.f214776a = tcLibWrapper;
        this.f214777b = fVar;
        this.f214778c = str;
    }

    public final void run() {
        TcLibWrapper tcLibWrapper = this.f214776a;
        C29690f fVar = this.f214777b;
        String str = this.f214778c;
        if (fVar == null) {
            ((C58970a) ((C58970a) TcLibWrapper.f214745a.mo56224b()).mo56372aa(4803)).mo56389s("Model fileGroup %s is null.", str);
            return;
        }
        C42813k a = C61905bo.m94564a(tcLibWrapper.f214746b);
        HashSet hashSet = new HashSet();
        for (C28595b bVar : fVar.f80416g) {
            Uri parse = Uri.parse(bVar.f77799c);
            String str2 = bVar.f77798b;
            if (str.equals("webrefModel")) {
                String[] split = str2.split(":", 2);
                if (split.length == 2 && !split[0].equals("global")) {
                    str2 = "slice:".concat(String.valueOf(split[1]));
                }
            }
            try {
                if (!a.mo45894h(parse)) {
                    C83305i iVar = tcLibWrapper.f214751g;
                    C82667nr g = C82668ns.m132013g();
                    ((C82438fe) g).f225252b = str;
                    g.mo76222b(str2);
                    ((C82438fe) g).f225253c = "NOT_FOUND";
                    iVar.mo75579d(g.mo76221a());
                    ((C58970a) ((C58970a) TcLibWrapper.f214745a.mo56225c()).mo56372aa(4801)).mo56359L("Model for %s provided but file id %s does not exist. Uri = %s", str, bVar.f77798b, parse);
                    hashSet.add("NOT_FOUND");
                }
            } catch (IOException e) {
                C83305i iVar2 = tcLibWrapper.f214751g;
                C82667nr g2 = C82668ns.m132013g();
                C82438fe feVar = (C82438fe) g2;
                feVar.f225252b = str;
                g2.mo76222b(bVar.f77798b);
                feVar.f225253c = "IO_EXCEPTION";
                iVar2.mo75579d(g2.mo76221a());
                ((C58970a) ((C58970a) ((C58970a) TcLibWrapper.f214745a.mo56225c()).mo56382g(e)).mo56372aa(4802)).mo56354G("Error while checking model file groups for %s and file id %s", str, bVar.f77798b);
                hashSet.add("IO_EXCEPTION");
            }
        }
        Collection.EL.stream(hashSet).forEach(new C77986d(tcLibWrapper, str, fVar));
    }
}
