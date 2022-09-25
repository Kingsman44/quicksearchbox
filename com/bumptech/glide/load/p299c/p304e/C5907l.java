package com.bumptech.glide.load.p299c.p304e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p281b.C5517a;
import com.bumptech.glide.p281b.C5518b;
import com.bumptech.glide.p281b.C5519c;
import com.bumptech.glide.p281b.C5521e;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p290g.C5602e;
import com.bumptech.glide.p291h.C5622i;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.e.l */
/* compiled from: PG */
final class C5907l {

    /* renamed from: a */
    public final C5517a f17533a;

    /* renamed from: b */
    public final List f17534b = new ArrayList();

    /* renamed from: c */
    final C5514ad f17535c;

    /* renamed from: d */
    public boolean f17536d;

    /* renamed from: e */
    public C5904i f17537e;

    /* renamed from: f */
    public boolean f17538f;

    /* renamed from: g */
    public C5904i f17539g;

    /* renamed from: h */
    public Bitmap f17540h;

    /* renamed from: i */
    public C5904i f17541i;

    /* renamed from: j */
    public int f17542j;

    /* renamed from: k */
    public int f17543k;

    /* renamed from: l */
    public int f17544l;

    /* renamed from: m */
    private final Handler f17545m;

    /* renamed from: n */
    private final C5642d f17546n;

    /* renamed from: o */
    private boolean f17547o;

    /* renamed from: p */
    private C6007z f17548p;

    public C5907l(C5543d dVar, C5517a aVar, int i, int i2, C5964w wVar, Bitmap bitmap) {
        C5642d dVar2 = dVar.f16788a;
        Context baseContext = dVar.f16789b.getBaseContext();
        C5514ad b = C5543d.m14323c(baseContext).mo12423b(baseContext);
        Context baseContext2 = dVar.f16789b.getBaseContext();
        C6007z b2 = C5543d.m14323c(baseContext2).mo12423b(baseContext2).mo11864b().mo11982o(((C5593j) ((C5593j) C5593j.m14520d(C5731x.f17283b).mo11975ac()).mo11978af()).mo11962O(i, i2));
        this.f17535c = b;
        Handler handler = new Handler(Looper.getMainLooper(), new C5906k(this));
        this.f17546n = dVar2;
        this.f17545m = handler;
        this.f17548p = b2;
        this.f17533a = aVar;
        mo12370e(wVar, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12366a() {
        return ((C5521e) this.f17533a).f16734f.f16713c;
    }

    /* renamed from: b */
    public final void mo12367b() {
        int i;
        if (this.f17536d && !this.f17547o) {
            C5904i iVar = this.f17541i;
            if (iVar != null) {
                this.f17541i = null;
                mo12368c(iVar);
                return;
            }
            this.f17547o = true;
            C5521e eVar = (C5521e) this.f17533a;
            C5519c cVar = eVar.f16734f;
            int i2 = cVar.f16713c;
            int i3 = 0;
            if (i2 > 0 && (i = eVar.f16733e) >= 0) {
                i3 = i < i2 ? ((C5518b) cVar.f16715e.get(i)).f16708i : -1;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f17533a.mo11896b();
            this.f17539g = new C5904i(this.f17545m, ((C5521e) this.f17533a).f16733e, uptimeMillis + ((long) i3));
            C6007z i4 = this.f17548p.mo11982o(C5593j.m14524h(new C5602e(Double.valueOf(Math.random())))).mo12447i(this.f17533a);
            i4.mo12455s(this.f17539g, (C5592i) null, i4, C5622i.f16959a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12368c(C5904i iVar) {
        this.f17547o = false;
        if (this.f17538f) {
            this.f17545m.obtainMessage(2, iVar).sendToTarget();
        } else if (this.f17536d) {
            if (iVar.f17529b != null) {
                mo12369d();
                C5904i iVar2 = this.f17537e;
                this.f17537e = iVar;
                int size = this.f17534b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C5905j) this.f17534b.get(size)).mo12352c();
                }
                if (iVar2 != null) {
                    this.f17545m.obtainMessage(2, iVar2).sendToTarget();
                }
            }
            mo12367b();
        } else {
            this.f17541i = iVar;
        }
    }

    /* renamed from: d */
    public final void mo12369d() {
        Bitmap bitmap = this.f17540h;
        if (bitmap != null) {
            this.f17546n.mo12116d(bitmap);
            this.f17540h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12370e(C5964w wVar, Bitmap bitmap) {
        C5630q.m14607d(wVar, "Argument must not be null");
        C5630q.m14607d(bitmap, "Argument must not be null");
        this.f17540h = bitmap;
        this.f17548p = this.f17548p.mo11982o(new C5593j().mo11971X(wVar, true));
        this.f17542j = C5632s.m14608a(bitmap);
        this.f17543k = bitmap.getWidth();
        this.f17544l = bitmap.getHeight();
    }
}
