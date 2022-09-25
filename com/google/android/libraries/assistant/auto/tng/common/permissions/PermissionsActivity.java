package com.google.android.libraries.assistant.auto.tng.common.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C1820g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public final class PermissionsActivity extends Activity {

    /* renamed from: a */
    private static final C59071e f41035a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.permissions.PermissionsActivity");

    /* renamed from: b */
    private final AtomicInteger f41036b = new AtomicInteger(0);

    /* renamed from: a */
    public static Intent m29570a(Context context, String[] strArr) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), PermissionsActivity.class.getName());
        intent.putExtra("requested_permissions", strArr);
        intent.addFlags(268435456);
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        finish();
    }

    public final void onStart() {
        super.onStart();
        Intent intent = getIntent();
        if (intent == null) {
            ((C59052c) ((C59052c) f41035a.mo56225c()).mo56372aa(44738)).mo56386p("Intent null");
            finish();
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("requested_permissions");
        if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
            ((C59052c) ((C59052c) f41035a.mo56225c()).mo56372aa(44737)).mo56389s("PermissionsToRequest is empty: %s", stringArrayExtra);
            finish();
            return;
        }
        C1820g.m4991a(this, stringArrayExtra, this.f41036b.getAndIncrement());
    }
}
