package com.google.android.libraries.onegoogle.accountmenu.features;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C2332ag;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30460a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.h */
/* compiled from: PG */
final class C30616h extends C30631n {

    /* renamed from: a */
    private final int f82703a;

    /* renamed from: b */
    private final Drawable f82704b;

    /* renamed from: c */
    private final String f82705c;

    /* renamed from: d */
    private final int f82706d;

    /* renamed from: e */
    private final View.OnClickListener f82707e;

    /* renamed from: f */
    private final C30465f f82708f;

    /* renamed from: g */
    private final C2332ag f82709g;

    /* renamed from: h */
    private final C58833ax f82710h;

    public C30616h(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener, C30465f fVar, C2332ag agVar, C58833ax axVar) {
        this.f82703a = i;
        this.f82704b = drawable;
        this.f82705c = str;
        this.f82706d = i2;
        this.f82707e = onClickListener;
        this.f82708f = fVar;
        this.f82709g = agVar;
        this.f82710h = axVar;
    }

    /* renamed from: a */
    public final int mo36319a() {
        return this.f82703a;
    }

    /* renamed from: b */
    public final int mo36320b() {
        return this.f82706d;
    }

    /* renamed from: c */
    public final Drawable mo36321c() {
        return this.f82704b;
    }

    /* renamed from: d */
    public final View.OnClickListener mo36322d() {
        return this.f82707e;
    }

    /* renamed from: e */
    public final C2332ag mo36323e() {
        return this.f82709g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r4.f82708f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.accountmenu.features.C30631n
            r2 = 0
            if (r1 == 0) goto L_0x0074
            com.google.android.libraries.onegoogle.accountmenu.features.n r5 = (com.google.android.libraries.onegoogle.accountmenu.features.C30631n) r5
            int r1 = r4.f82703a
            int r3 = r5.mo36319a()
            if (r1 != r3) goto L_0x0074
            android.graphics.drawable.Drawable r1 = r4.f82704b
            android.graphics.drawable.Drawable r3 = r5.mo36321c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r4.f82705c
            java.lang.String r3 = r5.mo36327h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            int r1 = r4.f82706d
            int r3 = r5.mo36320b()
            if (r1 != r3) goto L_0x0074
            android.view.View$OnClickListener r1 = r4.f82707e
            android.view.View$OnClickListener r3 = r5.mo36322d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            com.google.android.libraries.onegoogle.accountmenu.d.f r1 = r4.f82708f
            if (r1 != 0) goto L_0x004a
            com.google.android.libraries.onegoogle.accountmenu.d.f r1 = r5.mo36325f()
            if (r1 != 0) goto L_0x0074
            goto L_0x0055
        L_0x004a:
            com.google.android.libraries.onegoogle.accountmenu.d.f r3 = r5.mo36325f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0055
            goto L_0x0074
        L_0x0055:
            androidx.lifecycle.ag r1 = r4.f82709g
            androidx.lifecycle.ag r3 = r5.mo36323e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            com.google.android.libraries.onegoogle.accountmenu.d.a r1 = r5.mo36329i()
            if (r1 != 0) goto L_0x0074
            com.google.common.base.ax r1 = r4.f82710h
            com.google.common.base.ax r5 = r5.mo36326g()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0074
            return r0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.features.C30616h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C30465f mo36325f() {
        return this.f82708f;
    }

    /* renamed from: g */
    public final C58833ax mo36326g() {
        return this.f82710h;
    }

    /* renamed from: h */
    public final String mo36327h() {
        return this.f82705c;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f82703a ^ 1000003) * 1000003) ^ this.f82704b.hashCode()) * 1000003) ^ this.f82705c.hashCode()) * 1000003) ^ this.f82706d) * 1000003) ^ this.f82707e.hashCode()) * 1000003;
        C30465f fVar = this.f82708f;
        if (fVar == null) {
            i = 0;
        } else {
            i = fVar.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f82709g.hashCode()) * -721379959) ^ 2040732332;
    }

    /* renamed from: i */
    public final C30460a mo36329i() {
        return null;
    }

    public final String toString() {
        int i = this.f82703a;
        String obj = this.f82704b.toString();
        String str = this.f82705c;
        int i2 = this.f82706d;
        String obj2 = this.f82707e.toString();
        String valueOf = String.valueOf(this.f82708f);
        String obj3 = this.f82709g.toString();
        return "CustomActionSpec{id=" + i + ", icon=" + obj + ", label=" + str + ", veId=" + i2 + ", onClickListener=" + obj2 + ", visibilityHandler=" + valueOf + ", trailingTextLiveData=" + obj3 + ", highlightTextRetriever=null, availabilityChecker=Optional.absent()}";
    }
}
