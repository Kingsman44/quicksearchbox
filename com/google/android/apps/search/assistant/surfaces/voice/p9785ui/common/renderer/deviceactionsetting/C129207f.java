package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52131gj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.f */
/* compiled from: PG */
public final class C129207f implements C129146c {

    /* renamed from: b */
    private static final C33480d f354920b = C33480d.m62053a("show_device_setting_card_args", "assistant.api.client_op.ShowDeviceSettingCardArgs", C52131gj.f136789h);

    /* renamed from: a */
    public final AccountId f354921a;

    public C129207f(AccountId accountId) {
        this.f354921a = accountId;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        return C129025a.m210612a(dyVar, f354920b, new C129206e(this));
    }
}
