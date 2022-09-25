package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0816c;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.f */
/* compiled from: PG */
final class C132642f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0816c f361978a;

    /* renamed from: b */
    final /* synthetic */ C132643g f361979b;

    public C132642f(C132643g gVar, C0816c cVar) {
        this.f361979b = gVar;
        this.f361978a = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C132643g gVar = this.f361979b;
        C0816c cVar = this.f361978a;
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "permission_settings");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", gVar.f361981b.getPackageName(), (String) null));
        cVar.mo526b(intent);
        dialogInterface.dismiss();
    }
}
