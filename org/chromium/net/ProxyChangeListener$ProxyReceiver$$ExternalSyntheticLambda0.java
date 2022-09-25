package org.chromium.net;

import android.content.Intent;
import org.chromium.net.ProxyChangeListener;

/* compiled from: PG */
public final /* synthetic */ class ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ ProxyChangeListener.ProxyReceiver f$0;
    public /* synthetic */ Intent f$1;

    public /* synthetic */ ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0(ProxyChangeListener.ProxyReceiver proxyReceiver, Intent intent) {
        this.f$0 = proxyReceiver;
        this.f$1 = intent;
    }

    public final void run() {
        ProxyChangeListener.this.proxySettingsChanged(ProxyChangeListener.extractNewProxy(this.f$1));
    }
}
