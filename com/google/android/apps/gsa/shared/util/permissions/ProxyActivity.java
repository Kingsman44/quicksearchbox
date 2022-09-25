package com.google.android.apps.gsa.shared.util.permissions;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8852u.C118573f;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import java.util.Arrays;

/* compiled from: PG */
public class ProxyActivity extends Activity implements Handler.Callback {

    /* renamed from: a */
    private ResultReceiver f254340a;

    /* renamed from: b */
    private Handler f254341b;

    /* renamed from: a */
    private final int m148780a() {
        int a = C118573f.m196864a(getIntent().getIntExtra("permission-source", 0));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
            if (stringArrayExtra != null) {
                int[] iArr = new int[stringArrayExtra.length];
                Arrays.fill(iArr, -1);
                onRequestPermissionsResult(0, stringArrayExtra, iArr);
            } else {
                onActivityResult(0, 0, new Intent());
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.f254340a != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.intent.extra.INTENT", intent);
            this.f254340a.send(i2, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.I);
        super.onCreate(bundle);
        this.f254340a = (ResultReceiver) getIntent().getParcelableExtra("receiver");
        this.f254341b = new Handler(getMainLooper(), this);
        if (bundle == null) {
            C91090a aVar = new C91090a(this, this, 0);
            C91075b bVar = new C91075b(aVar.f254379a, aVar);
            Intent intent = (Intent) getIntent().getParcelableExtra("android.intent.extra.INTENT");
            if (intent != null) {
                aVar.mo65090b(intent, aVar);
                return;
            }
            IntentSender intentSender = (IntentSender) getIntent().getParcelableExtra("intent-sender");
            if (intentSender != null) {
                aVar.mo65091c(intentSender, aVar);
                return;
            }
            int a = m148780a();
            String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
            if (stringArrayExtra != null) {
                bVar.mo81047ju(stringArrayExtra, a, (C91078e) null);
            } else {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f254341b.removeMessages(1);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f254340a != null) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("permissions", strArr);
            bundle.putIntArray("permissions-grants", iArr);
            this.f254340a.send(0, bundle);
            C91075b.m148789c(this, m148780a(), strArr, iArr);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f254341b.sendEmptyMessage(1);
    }
}
