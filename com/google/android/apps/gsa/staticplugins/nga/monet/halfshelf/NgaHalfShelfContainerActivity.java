package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.monet.MonetActivity;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7100q.C90271a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* compiled from: PG */
public class NgaHalfShelfContainerActivity extends MonetActivity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.ae);
        NgaHalfShelfContainerActivity.super.onCreate(bundle);
    }

    /* renamed from: w */
    public final InitializationData mo93780w() {
        Intent intent = getIntent();
        C90334c.m146889d(intent, C90271a.f252143a, ProtoParcelable.f63423a);
        setIntent(intent);
        return NgaHalfShelfContainerActivity.super.w();
    }
}
