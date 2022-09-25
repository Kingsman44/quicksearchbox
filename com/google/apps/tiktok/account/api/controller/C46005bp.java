package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import androidx.savedstate.C4087c;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.account.api.controller.bp */
/* compiled from: PG */
public final /* synthetic */ class C46005bp implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ ActivityAccountState f120850a;

    public /* synthetic */ C46005bp(ActivityAccountState activityAccountState) {
        this.f120850a = activityAccountState;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        ActivityAccountState activityAccountState = this.f120850a;
        Bundle bundle = new Bundle();
        bundle.putInt("state_account_id", activityAccountState.f120784d);
        ProtoParsers.m95532o(bundle, "state_account_info", activityAccountState.f120785e);
        bundle.putInt("state_account_state", activityAccountState.f120786f);
        bundle.putBoolean("tiktok_accounts_disabled", activityAccountState.f120782b);
        return bundle;
    }
}
