package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1090b;

import android.widget.ImageView;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14131be;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14259cp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.common.p4552o.aeg;
import com.google.common.p4552o.aei;
import com.google.common.p4552o.aej;
import com.google.common.p4552o.aek;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.b.n */
/* compiled from: PG */
public final class C15128n implements C14131be {

    /* renamed from: a */
    public final C14986h f45406a;

    /* renamed from: b */
    public final C14132bf f45407b;

    /* renamed from: c */
    public ImageView f45408c;

    /* renamed from: d */
    public C14259cp f45409d;

    public C15128n(C14986h hVar, C14132bf bfVar) {
        this.f45406a = hVar;
        this.f45407b = bfVar;
    }

    /* renamed from: a */
    public final C28441k mo21443a() {
        int i;
        C62940bt btVar = C17939a.f51391a;
        aeg aeg = (aeg) aek.f158464e.createBuilder();
        aei aei = (aei) aej.f158460c.createBuilder();
        C14259cp cpVar = this.f45409d;
        if (cpVar != null) {
            i = C14632v.m30648b(cpVar.f43136a);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 2;
        }
        aei.copyOnWrite();
        aej aej = (aej) aei.instance;
        aej.f158463b = Integer.valueOf(C14632v.m30647a(i));
        aej.f158462a = 2;
        aeg.copyOnWrite();
        aek aek = (aek) aeg.instance;
        aej aej2 = (aej) aei.build();
        aej2.getClass();
        aek.f158468b = aej2;
        aek.f158467a |= 1;
        return new C28441k(btVar, (aek) aeg.build());
    }
}
