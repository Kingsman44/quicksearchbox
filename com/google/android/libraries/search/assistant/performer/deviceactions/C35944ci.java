package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ci */
/* compiled from: PG */
public final class C35944ci implements C35472h {

    /* renamed from: a */
    public static final C59071e f94117a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.ci");

    /* renamed from: b */
    private final C35470f f94118b;

    public C35944ci(C35470f fVar) {
        this.f94118b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C59104x b = f94117a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SetupAssistantDevicePerformer");
        ((C59052c) ((C59052c) b).mo56372aa(51865)).mo56386p("TNG SetUpAssistantDevicePerformer");
        if (dyVar.f135936b.equals("device.SET_UP_ASSISTANT_DEVICE")) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_trigger_port", false);
            bundle.putBoolean("hide_address_sequence", false);
            bundle.putBoolean("hide_room_sequence", false);
            bundle.putBoolean("show_media_sequence", false);
            Intent putExtra = new Intent().putExtra("seq_name", "DeviceRegistration").putExtra("seq_args", bundle).putExtra("hide_caption_bar", false).putExtra("sequence_theme", 0).putExtra("material_next_mode", 0).putExtra("sequence_orientation_mode", 2).putExtra("package_name", "com.google.android.googlequicksearchbox");
            Uri.Builder appendPath = new Uri.Builder().scheme("dynact").authority("static").appendPath("opaonboarding").appendPath("named-sequence-activity");
            Uri data = putExtra.getData();
            if (data != null) {
                appendPath.appendQueryParameter("data", data.toString());
            }
            Intent data2 = new Intent().setAction(putExtra.getAction()).setData(appendPath.build());
            data2.addFlags(putExtra.getFlags());
            data2.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.TransparentVelvetDynamicHostActivity"));
            data2.putExtra("com.google.android.libraries.velour.INNER_INTENT", putExtra);
            return C47633f.m84733g(this.f94118b.mo20101f(data2)).mo51515h(C35942cg.f94115a, C60826bg.f164896a).mo51513e(Exception.class, new C35943ch(data2), C60826bg.f164896a);
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.SET_UP_ASSISTANT_DEVICE", dyVar.f135936b}));
    }
}
