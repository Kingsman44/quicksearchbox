package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.a */
/* compiled from: PG */
public final class C114776a {

    /* renamed from: d */
    private static final C59071e f318499d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.a");

    /* renamed from: a */
    public final List f318500a = new ArrayList();

    /* renamed from: b */
    public final List f318501b = new ArrayList();

    /* renamed from: c */
    public final C72210d f318502c;

    public C114776a(C72210d dVar) {
        this.f318502c = dVar;
    }

    /* renamed from: a */
    public final void mo101591a(C53354ku kuVar) {
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        if ((lzVar.f137238a & 2) != 0) {
            C52395qd qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
            if ((qdVar.f137487a & 2) == 0) {
                this.f318500a.add(kuVar);
            } else if (!C114874f.m190415o(kuVar)) {
                this.f318501b.add(kuVar);
            }
        } else {
            ((C59052c) ((C59052c) f318499d.mo56226d()).mo56372aa(29516)).mo56386p("Attempted to add entry without start time. This is not a valid entry.");
            int i = C90755l.f253831a;
        }
    }
}
