package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14471kl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14472km;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.g */
/* compiled from: PG */
public final /* synthetic */ class C15333g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15336j f46017a;

    /* renamed from: b */
    public final /* synthetic */ int f46018b;

    /* renamed from: c */
    public final /* synthetic */ List f46019c;

    public /* synthetic */ C15333g(C15336j jVar, int i, List list) {
        this.f46017a = jVar;
        this.f46018b = i;
        this.f46019c = list;
    }

    public final void onClick(View view) {
        C15336j jVar = this.f46017a;
        int i = this.f46018b;
        List list = this.f46019c;
        C14986h hVar = jVar.f46026b;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
        C14471kl klVar = (C14471kl) C14472km.f43745c.createBuilder();
        klVar.copyOnWrite();
        ((C14472km) klVar.instance).f43747a = i;
        klVar.copyOnWrite();
        C14472km kmVar = (C14472km) klVar.instance;
        C62971cq cqVar = kmVar.f43748b;
        if (!cqVar.mo58948c()) {
            kmVar.f43748b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) kmVar.f43748b);
        iyVar.copyOnWrite();
        C14477kr krVar = (C14477kr) iyVar.instance;
        C14472km kmVar2 = (C14472km) klVar.build();
        kmVar2.getClass();
        krVar.f43759b = kmVar2;
        krVar.f43758a = 11;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14477kr krVar2 = (C14477kr) iyVar.build();
        krVar2.getClass();
        lfVar.f43801d = krVar2;
        lfVar.f43800c = 4;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
