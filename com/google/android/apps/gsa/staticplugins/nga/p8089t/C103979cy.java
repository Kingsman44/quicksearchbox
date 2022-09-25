package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80608c;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80624s;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.nga.shared.p6309ag.p6310a.C80606e;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.io.InputStream;
import java.util.HashSet;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cy */
/* compiled from: PG */
public final /* synthetic */ class C103979cy implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289378a;

    public /* synthetic */ C103979cy(C104026er erVar) {
        this.f289378a = erVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104026er erVar = this.f289378a;
        C118826c cVar = (C118826c) obj;
        HashSet hashSet = new HashSet();
        for (C80627v vVar : DesugarArrays.stream((T[]) C80624s.values()).map(C80608c.f221284a)) {
            if (!vVar.equals(C80627v.WEBREF) || !erVar.f289450d.mo79746e(C90126fx.f251054ba)) {
                try {
                    InputStream e = ((C80606e) erVar.f289453g.mo27525b()).mo74365e(vVar.name());
                    if (e != null) {
                        e.close();
                    }
                    hashSet.add(vVar);
                } catch (Exception unused) {
                }
            }
        }
        erVar.f289458l.mo93883e(hashSet);
        return C118826c.f331422a;
    }
}
