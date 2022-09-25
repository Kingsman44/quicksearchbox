package com.google.android.voicesearch.intentapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import dagger.C68214a;

/* compiled from: PG */
public class IntentApiReceiver extends C45423a {

    /* renamed from: a */
    public C89994f f118807a;

    /* renamed from: b */
    public C68214a f118808b;

    public final void onReceive(Context context, Intent intent) {
        Bundle bundle;
        mo49550a(context);
        if (isOrderedBroadcast()) {
            if (!"android.speech.action.GET_LANGUAGE_DETAILS".equals(intent.getAction())) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putString("android.speech.extra.LANGUAGE_PREFERENCE", this.f118807a.mo83885ae());
                if (!intent.getBooleanExtra("android.speech.extra.ONLY_RETURN_LANGUAGE_PREFERENCE", false)) {
                    bundle.putStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES", C92654a.m152609f(((C92541i) this.f118808b.mo27525b()).mo87316a()));
                    bundle.putStringArrayList("android.speech.extra.SUPPORTED_LANGUAGE_NAMES", C92654a.m152610g(((C92541i) this.f118808b.mo27525b()).mo87316a()));
                }
            }
            if (bundle != null) {
                setResultExtras(bundle);
            }
        }
    }
}
