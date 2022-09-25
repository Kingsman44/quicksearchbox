package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* compiled from: PG */
public final class ProxyPermissionsRequester implements C91079f {

    /* renamed from: a */
    private final C91097g f254345a;

    /* renamed from: b */
    private final Context f254346b;

    /* compiled from: PG */
    class WrapperPermissionsCallback extends ResultReceiver {

        /* renamed from: a */
        private final C91078e f254347a;

        public WrapperPermissionsCallback(C91078e eVar) {
            super(new Handler(Looper.getMainLooper()));
            this.f254347a = eVar;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            C91078e eVar = this.f254347a;
            if (eVar != null) {
                eVar.mo18206a(bundle.getStringArray("permissions"), bundle.getIntArray("permissions-grants"));
            }
        }
    }

    public ProxyPermissionsRequester(C91097g gVar, Context context) {
        this.f254345a = gVar;
        this.f254346b = context;
    }

    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        this.f254345a.mo65089a(new Intent(this.f254346b, ProxyActivity.class).putExtra("permissions", strArr).putExtra("permission-source", i - 1).putExtra("receiver", new WrapperPermissionsCallback(eVar)));
    }
}
