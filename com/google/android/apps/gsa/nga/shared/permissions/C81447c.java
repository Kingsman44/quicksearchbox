package com.google.android.apps.gsa.nga.shared.permissions;

import androidx.activity.result.C0815b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.permissions.c */
/* compiled from: PG */
final class C81447c implements C0815b {

    /* renamed from: a */
    final /* synthetic */ PermissionsRequestActivity f222861a;

    public C81447c(PermissionsRequestActivity permissionsRequestActivity) {
        this.f222861a = permissionsRequestActivity;
    }

    public final /* synthetic */ void onActivityResult(Object obj) {
        Boolean bool = (Boolean) ((Map) obj).get("android.permission.RECORD_AUDIO");
        if (bool != null) {
            PermissionsRequestActivity permissionsRequestActivity = this.f222861a;
            boolean booleanValue = bool.booleanValue();
            C58976aa aaVar = C58975e.f156826a;
            String stringExtra = permissionsRequestActivity.getIntent().getStringExtra("invocation_source");
            if (!booleanValue && stringExtra != null) {
                permissionsRequestActivity.f222856b.mo76997j(stringExtra);
            }
        }
        this.f222861a.finish();
    }
}
