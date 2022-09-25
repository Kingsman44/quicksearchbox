package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95029a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.o */
/* compiled from: PG */
public final /* synthetic */ class C95442o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f267048a;

    /* renamed from: b */
    public final /* synthetic */ int f267049b;

    /* renamed from: c */
    public final /* synthetic */ int f267050c;

    public /* synthetic */ C95442o(ByteBuffer byteBuffer, int i, int i2) {
        this.f267048a = byteBuffer;
        this.f267049b = i;
        this.f267050c = i2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        ByteBuffer byteBuffer = this.f267048a;
        int i = this.f267049b;
        ((C95029a) obj).mo88946a(Arrays.copyOfRange(byteBuffer.array(), i, this.f267050c + i));
        return null;
    }
}
