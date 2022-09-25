package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.h */
/* compiled from: PG */
final class C30467h extends C30464e {

    /* renamed from: a */
    public final int f82300a;

    /* renamed from: b */
    public final Drawable f82301b;

    /* renamed from: c */
    public final String f82302c;

    /* renamed from: d */
    public final int f82303d;

    /* renamed from: e */
    public final View.OnClickListener f82304e;

    /* renamed from: f */
    public final C30465f f82305f;

    /* renamed from: g */
    public final LiveData f82306g;

    /* renamed from: h */
    public final boolean f82307h;

    /* renamed from: i */
    public final C30461b f82308i;

    /* renamed from: j */
    public final C58833ax f82309j;

    /* renamed from: k */
    public final C58833ax f82310k;

    /* renamed from: l */
    public final C30460a f82311l;

    public C30467h(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener, C30465f fVar, LiveData liveData, C30460a aVar, boolean z, C30461b bVar, C58833ax axVar, C58833ax axVar2) {
        this.f82300a = i;
        this.f82301b = drawable;
        this.f82302c = str;
        this.f82303d = i2;
        this.f82304e = onClickListener;
        this.f82305f = fVar;
        this.f82306g = liveData;
        this.f82311l = aVar;
        this.f82307h = z;
        this.f82308i = bVar;
        this.f82309j = axVar;
        this.f82310k = axVar2;
    }

    /* renamed from: a */
    public final int mo36061a() {
        return this.f82300a;
    }

    /* renamed from: b */
    public final int mo36062b() {
        return this.f82303d;
    }

    /* renamed from: c */
    public final Drawable mo36063c() {
        return this.f82301b;
    }

    /* renamed from: d */
    public final View.OnClickListener mo36064d() {
        return this.f82304e;
    }

    /* renamed from: e */
    public final LiveData mo36065e() {
        return this.f82306g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r4.f82305f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r1 = r4.f82306g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r1 = r4.f82311l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e
            r2 = 0
            if (r1 == 0) goto L_0x00ac
            com.google.android.libraries.onegoogle.accountmenu.d.e r5 = (com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e) r5
            int r1 = r4.f82300a
            int r3 = r5.mo36061a()
            if (r1 != r3) goto L_0x00ac
            android.graphics.drawable.Drawable r1 = r4.f82301b
            android.graphics.drawable.Drawable r3 = r5.mo36063c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = r4.f82302c
            java.lang.String r3 = r5.mo36072m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
            int r1 = r4.f82303d
            int r3 = r5.mo36062b()
            if (r1 != r3) goto L_0x00ac
            android.view.View$OnClickListener r1 = r4.f82304e
            android.view.View$OnClickListener r3 = r5.mo36064d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
            com.google.android.libraries.onegoogle.accountmenu.d.f r1 = r4.f82305f
            if (r1 != 0) goto L_0x004a
            com.google.android.libraries.onegoogle.accountmenu.d.f r1 = r5.mo36069j()
            if (r1 != 0) goto L_0x00ac
            goto L_0x0054
        L_0x004a:
            com.google.android.libraries.onegoogle.accountmenu.d.f r3 = r5.mo36069j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
        L_0x0054:
            androidx.lifecycle.LiveData r1 = r4.f82306g
            if (r1 != 0) goto L_0x005f
            androidx.lifecycle.LiveData r1 = r5.mo36065e()
            if (r1 != 0) goto L_0x00ac
            goto L_0x0069
        L_0x005f:
            androidx.lifecycle.LiveData r3 = r5.mo36065e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
        L_0x0069:
            com.google.android.libraries.onegoogle.accountmenu.d.a r1 = r4.f82311l
            if (r1 != 0) goto L_0x0074
            com.google.android.libraries.onegoogle.accountmenu.d.a r1 = r5.mo36074o()
            if (r1 != 0) goto L_0x00ac
            goto L_0x007f
        L_0x0074:
            com.google.android.libraries.onegoogle.accountmenu.d.a r3 = r5.mo36074o()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x007f
            goto L_0x00ac
        L_0x007f:
            boolean r1 = r4.f82307h
            boolean r3 = r5.mo36073n()
            if (r1 != r3) goto L_0x00ac
            com.google.android.libraries.onegoogle.accountmenu.d.b r1 = r4.f82308i
            com.google.android.libraries.onegoogle.accountmenu.d.b r3 = r5.mo36066f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
            com.google.common.base.ax r1 = r4.f82309j
            com.google.common.base.ax r3 = r5.mo36070k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
            com.google.common.base.ax r1 = r4.f82310k
            com.google.common.base.ax r5 = r5.mo36071l()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00ac
            return r0
        L_0x00ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.p2356d.C30467h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C30461b mo36066f() {
        return this.f82308i;
    }

    /* renamed from: h */
    public final C30462c mo36067h() {
        return new C30466g(this);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((((this.f82300a ^ 1000003) * 1000003) ^ this.f82301b.hashCode()) * 1000003) ^ this.f82302c.hashCode()) * 1000003) ^ this.f82303d) * 1000003) ^ this.f82304e.hashCode()) * 1000003;
        C30465f fVar = this.f82305f;
        int i3 = 0;
        if (fVar == null) {
            i = 0;
        } else {
            i = fVar.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        LiveData liveData = this.f82306g;
        if (liveData == null) {
            i2 = 0;
        } else {
            i2 = liveData.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C30460a aVar = this.f82311l;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((((((i5 ^ i3) * 1000003) ^ (true != this.f82307h ? 1237 : 1231)) * 1000003) ^ this.f82308i.hashCode()) * 1000003) ^ this.f82309j.hashCode()) * 1000003) ^ this.f82310k.hashCode();
    }

    /* renamed from: j */
    public final C30465f mo36069j() {
        return this.f82305f;
    }

    /* renamed from: k */
    public final C58833ax mo36070k() {
        return this.f82309j;
    }

    /* renamed from: l */
    public final C58833ax mo36071l() {
        return this.f82310k;
    }

    /* renamed from: m */
    public final String mo36072m() {
        return this.f82302c;
    }

    /* renamed from: n */
    public final boolean mo36073n() {
        return this.f82307h;
    }

    /* renamed from: o */
    public final C30460a mo36074o() {
        return this.f82311l;
    }

    public final String toString() {
        int i = this.f82300a;
        String obj = this.f82301b.toString();
        String str = this.f82302c;
        int i2 = this.f82303d;
        String obj2 = this.f82304e.toString();
        String valueOf = String.valueOf(this.f82305f);
        String valueOf2 = String.valueOf(this.f82306g);
        String valueOf3 = String.valueOf(this.f82311l);
        boolean z = this.f82307h;
        String obj3 = this.f82308i.toString();
        String valueOf4 = String.valueOf(this.f82309j);
        String valueOf5 = String.valueOf(this.f82310k);
        return "ActionSpec{id=" + i + ", icon=" + obj + ", label=" + str + ", veId=" + i2 + ", onClickListener=" + obj2 + ", visibilityHandler=" + valueOf + ", trailingTextContentLiveData=" + valueOf2 + ", highlightTextRetriever=" + valueOf3 + ", visibleOnIncognito=" + z + ", actionType=" + obj3 + ", availabilityChecker=" + valueOf4 + ", customLabelContentDescription=" + valueOf5 + "}";
    }
}
