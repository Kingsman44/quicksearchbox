package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.p031v4.app.Fragment;
import android.view.animation.ScaleAnimation;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60423pr;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.af */
/* compiled from: PG */
public final class C135808af {

    /* renamed from: a */
    public static final C59071e f369912a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.g.af");

    /* renamed from: b */
    public static final Duration f369913b = Duration.ofMillis(600);

    /* renamed from: c */
    public final Fragment f369914c;

    /* renamed from: d */
    public final C60423pr f369915d;

    /* renamed from: e */
    public final C38768q f369916e;

    /* renamed from: f */
    public final C28306ab f369917f;

    /* renamed from: g */
    public final C135824av f369918g;

    /* renamed from: h */
    public final C47770dh f369919h;

    /* renamed from: i */
    public final C28443m f369920i;

    /* renamed from: j */
    public final C47449e f369921j;

    /* renamed from: k */
    public final Duration f369922k;

    /* renamed from: l */
    public final boolean f369923l;

    /* renamed from: m */
    public final ScaleAnimation f369924m = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);

    /* renamed from: n */
    public final ValueAnimator f369925n = ValueAnimator.ofInt(new int[]{0, 1});

    /* renamed from: o */
    final AnimatorListenerAdapter f369926o = new C135806ad(this);

    public C135808af(Fragment fragment, C60423pr prVar, C38768q qVar, C28306ab abVar, C47770dh dhVar, C28443m mVar, C135824av avVar, C47449e eVar, C62910ar arVar, boolean z) {
        this.f369914c = fragment;
        this.f369915d = prVar;
        this.f369916e = qVar;
        this.f369917f = abVar;
        this.f369919h = dhVar;
        this.f369920i = mVar;
        this.f369918g = avVar;
        this.f369921j = eVar;
        this.f369922k = C62950b.m95473d(arVar);
        this.f369923l = z;
    }

    /* renamed from: a */
    public static C135851x m220350a(AccountId accountId, C60423pr prVar) {
        C135851x xVar = new C135851x();
        C68324h.m98669f(xVar);
        C47247a.m84047b(xVar, accountId);
        C47243l.m84039a(xVar, prVar);
        return xVar;
    }
}
