package com.google.android.flexbox;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
/* compiled from: PG */
public final class C142637b {

    /* renamed from: a */
    int f387037a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f387038b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f387039c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d */
    int f387040d = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: e */
    int f387041e;

    /* renamed from: f */
    int f387042f;

    /* renamed from: g */
    int f387043g;

    /* renamed from: h */
    int f387044h;

    /* renamed from: i */
    int f387045i;

    /* renamed from: j */
    float f387046j;

    /* renamed from: k */
    float f387047k;

    /* renamed from: l */
    int f387048l;

    /* renamed from: m */
    int f387049m;

    /* renamed from: n */
    final List f387050n = new ArrayList();

    /* renamed from: o */
    int f387051o;

    /* renamed from: p */
    int f387052p;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo117401a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f387037a = Math.min(this.f387037a, (view.getLeft() - flexItem.mo117343g()) - i);
        this.f387038b = Math.min(this.f387038b, (view.getTop() - flexItem.mo117345i()) - i2);
        this.f387039c = Math.max(this.f387039c, view.getRight() + flexItem.mo117344h() + i3);
        this.f387040d = Math.max(this.f387040d, view.getBottom() + flexItem.mo117342f() + i4);
    }
}
