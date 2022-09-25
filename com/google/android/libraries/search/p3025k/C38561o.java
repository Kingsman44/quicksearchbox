package com.google.android.libraries.search.p3025k;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.p3025k.p3027b.C38543c;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.k.o */
/* compiled from: PG */
public abstract class C38561o {

    /* renamed from: a */
    private final Optional f101939a;

    /* renamed from: b */
    private final Fragment f101940b;

    /* renamed from: c */
    private final int f101941c;

    protected C38561o(Optional optional, Fragment fragment, int i) {
        this.f101939a = optional;
        this.f101940b = fragment;
        this.f101941c = i;
    }

    /* renamed from: b */
    private final Boolean m67845b() {
        if (this.f101939a.isPresent() && ((C38553h) this.f101939a.get()).f101930a) {
            int i = this.f101941c;
            if (i == 1) {
                throw new IllegalStateException("Incognito is not supported.");
            } else if (i == 3) {
                C38543c.m67825f().showNow(this.f101940b.getChildFragmentManager(), "entrypoint_incognito_offramp");
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo41488a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo41489c(Fragment fragment, Intent intent, Object obj) {
        C47709i.m84861a(fragment, intent);
    }

    /* renamed from: e */
    public final void mo41490e(Object obj) {
        if (!m67845b().booleanValue()) {
            mo41489c(this.f101940b, mo41488a(obj), obj);
        }
    }

    /* renamed from: f */
    public final void mo41491f(Object obj) {
        if (!m67845b().booleanValue()) {
            Fragment fragment = this.f101940b;
            mo41489c(fragment, mo41488a(obj), obj);
            C0167am activity = fragment.getActivity();
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }
}
