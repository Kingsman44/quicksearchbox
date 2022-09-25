package com.google.android.libraries.lens.view.feedback;

import android.graphics.Bitmap;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54065q;
import com.google.p4017at.p4056g.p4057a.p4058a.C54066r;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.feedback.m */
/* compiled from: PG */
public final /* synthetic */ class C25822m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f70162a;

    public /* synthetic */ C25822m(Bitmap bitmap) {
        this.f70162a = bitmap;
    }

    public final Object call() {
        Bitmap bitmap = this.f70162a;
        C58974d dVar = C25823n.f70163a;
        C63087y v = C63088z.m96150v();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, v);
        C54065q qVar = (C54065q) C54066r.f141866d.createBuilder();
        C63088z b = v.mo59165b();
        qVar.copyOnWrite();
        b.getClass();
        ((C54066r) qVar.instance).f141868a = b;
        return new ProtoParsers.InternalDontUse((byte[]) null, (C54066r) qVar.build());
    }
}
