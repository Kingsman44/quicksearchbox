package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.lens.p4701g.C62253ac;
import com.google.lens.p4701g.C62262al;
import com.google.lens.p4701g.C62263am;
import com.google.lens.p4701g.C62279bb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ah */
/* compiled from: PG */
public final /* synthetic */ class C24543ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C62253ac f67222a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f67223b;

    public /* synthetic */ C24543ah(C62253ac acVar, Bitmap bitmap) {
        this.f67222a = acVar;
        this.f67223b = bitmap;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C62253ac acVar = this.f67222a;
        Bitmap bitmap = this.f67223b;
        C62279bb bbVar = (C62279bb) obj;
        C62262al alVar = (C62262al) C62263am.f168101d.createBuilder();
        String str = bbVar.f168137b;
        alVar.copyOnWrite();
        C62263am amVar = (C62263am) alVar.instance;
        str.getClass();
        amVar.f168103a |= 1;
        amVar.f168104b = str;
        C58485gu guVar = (C58485gu) Collection.EL.stream(bbVar.f168138c).map(new C24544ai(acVar, bitmap)).collect(C58370cn.f155946a);
        alVar.copyOnWrite();
        C62263am amVar2 = (C62263am) alVar.instance;
        C62971cq cqVar = amVar2.f168105c;
        if (!cqVar.mo58948c()) {
            amVar2.f168105c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) amVar2.f168105c);
        return (C62263am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
