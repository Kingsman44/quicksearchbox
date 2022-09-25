package com.facebook.litho;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.yoga.C6570f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: com.facebook.litho.o */
/* compiled from: PG */
public abstract class C6405o implements Cloneable {

    /* renamed from: a */
    private C6411u f18978a;

    /* renamed from: b */
    public C6268fk f18979b;

    /* renamed from: c */
    public C6407q f18980c;

    /* renamed from: m */
    protected static void m17225m(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    /* renamed from: A */
    public final void mo13417A(C6138bs bsVar) {
        this.f18980c.mo13457h().put(8, bsVar);
    }

    /* renamed from: B */
    public final void mo13418B(C6138bs bsVar) {
        this.f18980c.mo13457h().put(4, bsVar);
    }

    /* renamed from: C */
    public final void mo13419C(C6138bs bsVar) {
        this.f18980c.mo13457h().put(5, bsVar);
    }

    /* renamed from: D */
    public final void mo13420D(String str) {
        C6402l J = this.f18980c.mo13456J();
        J.f18967a = (byte) (J.f18967a | 2);
        J.f18971e = str;
    }

    /* renamed from: E */
    public final void mo13421E(C6362go goVar) {
        if (goVar != null) {
            C6401k d = this.f18980c.mo13456J().mo13412d();
            d.f18954a |= C89885b.S3REQUEST_VALUE;
            d.f18962i = goVar;
            return;
        }
        throw new IllegalArgumentException("TransitionKeyType must not be null");
    }

    /* renamed from: F */
    public final void mo13422F(C6138bs bsVar) {
        this.f18980c.mo13457h().put(2, bsVar);
    }

    /* renamed from: G */
    public final void mo13423G(C6138bs bsVar) {
        this.f18980c.mo13457h().put(3, bsVar);
    }

    /* renamed from: H */
    public final void mo13424H(Object obj) {
        this.f18980c.mo13456J().mo13411E().mo13062ad(obj);
    }

    /* renamed from: I */
    public final void mo13425I(C6154cb cbVar) {
        C6401k d = this.f18980c.mo13456J().mo13412d();
        d.f18954a |= 8;
        d.f18955b = cbVar;
    }

    /* renamed from: J */
    public final void mo13426J(int i, float f) {
        int a = this.f18979b.mo13257a(f);
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 8388608;
        if (jVar.f18951x == null) {
            jVar.f18951x = new C6139bt();
        }
        jVar.f18951x.mo13122e(i, (float) a);
    }

    /* renamed from: K */
    public final void mo13427K(int i, float f) {
        int a = this.f18979b.mo13257a(f);
        C6401k d = this.f18980c.mo13456J().mo13412d();
        d.f18954a |= 256;
        if (d.f18959f == null) {
            d.f18959f = new C6139bt();
        }
        d.f18959f.mo13122e(i, (float) a);
    }

    /* renamed from: L */
    public final void mo13428L(Object obj) {
        this.f18980c.mo13456J().f18972f = obj;
    }

    /* renamed from: M */
    public final void mo13429M(float f) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 32768;
        jVar.f18941n = f;
    }

    /* renamed from: N */
    public final void mo13430N(float f) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 65536;
        jVar.f18942o = f;
    }

    /* renamed from: O */
    public final void mo13431O(float f) {
        int a = this.f18979b.mo13257a(f);
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 64;
        jVar.f18935h = a;
    }

    /* renamed from: P */
    public final void mo13432P(int i, int i2) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 33554432;
        if (jVar.f18949v == null) {
            jVar.f18949v = new C6139bt();
        }
        jVar.f18949v.mo13122e(i, (float) i2);
    }

    /* renamed from: Q */
    public final void mo13433Q(int i) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 256;
        jVar.f18937j = i;
    }

    /* renamed from: R */
    public final void mo13434R(int i, int i2) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= C89885b.NOW_VALUE;
        if (jVar.f18948u == null) {
            jVar.f18948u = new C6139bt();
        }
        jVar.f18948u.mo13122e(i, (float) i2);
    }

    /* renamed from: S */
    public final void mo13435S(int i) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 1048576;
        jVar.f18927A = i;
    }

    /* renamed from: T */
    public final void mo13436T(C6154cb cbVar) {
        this.f18980c.mo13456J().mo13411E().mo13061ac(cbVar);
    }

    /* renamed from: U */
    public final void mo13437U(float f) {
        int a = this.f18979b.mo13257a(f);
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 1;
        jVar.f18929b = a;
    }

    /* renamed from: V */
    public final void mo13438V() {
        this.f18980c.mo13456J().f18973g = true;
    }

    /* renamed from: a */
    public abstract C6407q mo13259a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13260b(C6407q qVar);

    /* renamed from: k */
    public abstract void mo13268k();

    /* renamed from: l */
    public final C6405o clone() {
        try {
            C6405o oVar = (C6405o) super.clone();
            C6407q j = this.f18980c.mo13318j();
            oVar.f18980c = j;
            oVar.mo13260b(j);
            return oVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public final void mo13441n(float f) {
        C6402l J = this.f18980c.mo13456J();
        J.mo13411E().mo13042L(f);
        J.f18967a = (byte) (f == 1.0f ? J.f18967a & -9 : J.f18967a | 8);
    }

    /* renamed from: o */
    public final void mo13442o(C6138bs bsVar) {
        this.f18980c.mo13457h().put(1, bsVar);
    }

    /* renamed from: p */
    public void mo13443p(float f) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 524288;
        jVar.f18945r = f;
    }

    /* renamed from: q */
    public final void mo13444q(Drawable drawable) {
        C6402l J = this.f18980c.mo13456J();
        J.f18967a = (byte) (J.f18967a | 1);
        J.f18970d = drawable;
    }

    /* renamed from: r */
    public final void mo13445r(C6154cb cbVar) {
        this.f18980c.mo13456J().mo13411E().mo13043M(cbVar);
    }

    /* renamed from: s */
    public void mo13316s(boolean z) {
        this.f18980c.mo13456J().mo13411E().mo13045O(z);
    }

    /* renamed from: t */
    public void mo13446t(CharSequence charSequence) {
        this.f18980c.mo13456J().mo13411E().mo13047Q(charSequence);
    }

    /* renamed from: u */
    public final void mo13447u(boolean z) {
        this.f18980c.mo13456J().mo13411E().mo13051U(z);
    }

    /* renamed from: v */
    public final void mo13448v(int i) {
        C6401k d = this.f18980c.mo13456J().mo13412d();
        d.f18954a |= 1;
        d.f18958e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo13449w(C6411u uVar, C6407q qVar) {
        this.f18979b = uVar.f19013f;
        this.f18980c = qVar;
        this.f18978a = uVar;
        C6407q qVar2 = uVar.f19012e;
        if (qVar2 != null) {
            this.f18980c.f18990m = C6407q.m17273E(qVar2);
        }
        this.f18980c.f18998u = uVar.f19009b;
    }

    /* renamed from: x */
    public final void mo13450x(String str) {
        if (str == null) {
            C6407q qVar = this.f18978a.f19012e;
            String q = qVar != null ? qVar.mo13461q() : "unknown component";
            C6106aq.m15891b(2, "Component:NullKeySet", "Setting a null key from " + q + " which is usually a mistake! If it is not, explicitly set the String 'null'");
            str = "null";
        }
        C6407q qVar2 = this.f18980c;
        qVar2.f18993p = true;
        qVar2.f18992o = str;
    }

    /* renamed from: y */
    public final void mo13451y(int i, Paint paint) {
        C6401k d = this.f18980c.mo13456J().mo13412d();
        d.f18965l = i;
        d.f18966m = paint;
    }

    /* renamed from: z */
    public final void mo13452z(C6570f fVar) {
        C6397j jVar = (C6397j) this.f18980c.mo13456J().mo13410D();
        jVar.f18928a |= 4096;
        jVar.f18946s = fVar;
    }
}
