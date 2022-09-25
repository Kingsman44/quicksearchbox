package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* compiled from: PG */
public final class ProxyIntentStarter extends C91093c implements C91096f {

    /* renamed from: a */
    private final Context f254342a;

    /* compiled from: PG */
    class WrapperResultCallback extends ResultReceiver {

        /* renamed from: a */
        private final C91096f f254343a;

        /* renamed from: b */
        private final Context f254344b;

        public WrapperResultCallback(C91096f fVar, Context context) {
            super(new Handler());
            this.f254343a = fVar;
            this.f254344b = context;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            this.f254343a.mo17703hg(i, (Intent) bundle.getParcelable("android.intent.extra.INTENT"), this.f254344b);
        }
    }

    public ProxyIntentStarter(Context context) {
        super(context);
        this.f254342a = context;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        if (!mo85363m(intent)) {
            return super.mo65089a(intent);
        }
        mo65090b(intent, this);
        return true;
    }

    /* renamed from: b */
    public final boolean mo65090b(Intent intent, C91096f fVar) {
        mo65089a(new Intent(this.f254342a, ProxyActivity.class).putExtra("android.intent.extra.INTENT", intent).setFlags(intent.getFlags() & -268435457).putExtra("receiver", new WrapperResultCallback(fVar, this.f254342a)));
        return true;
    }

    /* renamed from: c */
    public final boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        mo65089a(new Intent(this.f254342a, ProxyActivity.class).putExtra("intent-sender", intentSender).putExtra("receiver", new WrapperResultCallback(fVar, this.f254342a)));
        return true;
    }

    /* renamed from: d */
    public final boolean mo65092d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo65093e() {
        return true;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        return true;
    }
}
