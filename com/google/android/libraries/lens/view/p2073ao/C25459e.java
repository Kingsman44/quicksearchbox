package com.google.android.libraries.lens.view.p2073ao;

import android.content.Context;
import android.view.View;
import androidx.p060c.C0977g;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26862e;
import com.google.common.p4526f.p4527a.C58974d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.ao.e */
/* compiled from: PG */
public final class C25459e {

    /* renamed from: k */
    private static final float[] f69385k = {1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: a */
    public boolean f69386a;

    /* renamed from: b */
    public int f69387b = -1;

    /* renamed from: c */
    public boolean f69388c;

    /* renamed from: d */
    public Context f69389d;

    /* renamed from: e */
    public final ByteBuffer f69390e;

    /* renamed from: f */
    public final Map f69391f = new C0977g();

    /* renamed from: g */
    public final AtomicInteger f69392g = new AtomicInteger(0);

    /* renamed from: h */
    public C25455a f69393h;

    /* renamed from: i */
    public int f69394i = 1;

    /* renamed from: j */
    public C26862e f69395j;

    static {
        C58974d.m91135i("RgnFlt");
    }

    public C25459e() {
        float[] fArr = f69385k;
        int length = fArr.length;
        ByteBuffer order = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        this.f69390e = order;
        order.asFloatBuffer().put(fArr);
        order.rewind();
    }

    /* renamed from: a */
    public final C25457c mo30495a(View view) {
        synchronized (this.f69391f) {
            C25457c cVar = (C25457c) this.f69391f.get(Integer.valueOf(view.hashCode()));
            if (cVar != null) {
                return cVar;
            }
            C25457c cVar2 = new C25457c();
            this.f69391f.put(Integer.valueOf(view.hashCode()), cVar2);
            return cVar2;
        }
    }

    /* renamed from: b */
    public final void mo30496b(View view, float f, float f2, float f3, float f4) {
        mo30495a(view).f69379a = new C25456b(f, f2, f3, f4, this.f69392g.get());
    }
}
