package com.google.android.libraries.notifications.platform.p2339i.p2340a;

import com.google.android.libraries.notifications.platform.p2310d.C30081d;
import com.google.android.libraries.notifications.platform.p2310d.C30084g;
import com.google.android.libraries.notifications.platform.p2310d.C30087j;
import com.google.android.libraries.notifications.platform.p2310d.C30088k;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58585km;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C30145a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C30145a f81519a = new C30145a();

    private /* synthetic */ C30145a() {
    }

    public final Object apply(Object obj) {
        byte[] bArr;
        C61366ah ahVar = (C61366ah) obj;
        C30087j g = C30088k.m55906g();
        g.f81419e = true;
        C30081d dVar = (C30081d) g;
        dVar.f81406a = Integer.valueOf(ahVar.f165947c);
        ByteBuffer byteBuffer = ahVar.f165946b;
        int i = 0;
        if (byteBuffer == null) {
            bArr = new byte[0];
        } else if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            if (arrayOffset != 0) {
                i = arrayOffset;
            } else if (byteBuffer.array().length == byteBuffer.limit()) {
                bArr = byteBuffer.array();
            }
            bArr = Arrays.copyOfRange(byteBuffer.array(), i, byteBuffer.limit() + i);
        } else {
            byte[] bArr2 = new byte[byteBuffer.limit()];
            int position = byteBuffer.position();
            byteBuffer.position(0);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            bArr = bArr2;
        }
        dVar.f81408c = bArr;
        C58585km kmVar = ahVar.f165945a;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : kmVar.mo54950C().entrySet()) {
            gzVar.mo55429h(C30084g.m55892b(((C61362ad) entry.getKey()).mo57931a()), (List) entry.getValue());
        }
        g.mo35471b().putAll(gzVar.mo55427f(true));
        return g.mo35486f();
    }
}
