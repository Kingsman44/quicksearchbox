package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.C72382h;
import org.chromium.base.TraceEvent;
import p000J.C0000N;

/* compiled from: PG */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* compiled from: PG */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* compiled from: PG */
    class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0(this, intent));
            }
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    private void assertOnThread() {
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* access modifiers changed from: private */
    public static C72557v extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return C72557v.m107247a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private C72557v getProxyConfig(Intent intent) {
        ProxyInfo defaultProxy = ((ConnectivityManager) C72382h.f192527a.getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy == null) {
            return C72557v.f193077a;
        }
        if (!"localhost".equals(defaultProxy.getHost()) || defaultProxy.getPort() != -1) {
            return C72557v.m107247a(defaultProxy);
        }
        return extractNewProxy(intent);
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* access modifiers changed from: private */
    public void proxySettingsChanged(C72557v vVar) {
        if (sEnabled) {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            long j = this.mNativePtr;
            if (j != 0) {
                if (vVar != null) {
                    C0000N.MyoFZt$2(j, this, vVar.f193078b, vVar.f193079c, vVar.f193080d, vVar.f193081e);
                    return;
                }
                C0000N.MCIk73GZ(j, this);
            }
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        C72382h.f192527a.registerReceiver(this.mProxyReceiver, new IntentFilter(), (String) null, (Handler) null, 4);
        this.mRealProxyReceiver = new C72556u(this);
        Intent registerReceiver = C72382h.f192527a.registerReceiver(this.mRealProxyReceiver, intentFilter, (String) null, (Handler) null, 4);
        if (registerReceiver != null) {
            updateProxyConfigFromConnectivityManager(registerReceiver);
        }
    }

    /* access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    private void unregisterReceiver() {
        C72382h.f192527a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            C72382h.f192527a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    /* renamed from: lambda$updateProxyConfigFromConnectivityManager$0$org-chromium-net-ProxyChangeListener */
    public /* synthetic */ void mo64047x961b7c4a(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        TraceEvent c = TraceEvent.m107032c("ProxyChangeListener.start");
        try {
            this.mNativePtr = j;
            registerReceiver();
            if (c != null) {
                TraceEvent.m107031b(c.f192513d, 0);
                return;
            }
            return;
        } catch (Throwable th) {
            ProxyChangeListener$$ExternalSyntheticBackport0.m107080m(th, th);
        }
        throw th;
    }

    public void stop() {
        this.mNativePtr = 0;
        unregisterReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(Intent intent) {
        runOnThread(new ProxyChangeListener$$ExternalSyntheticLambda1(this, intent));
    }
}
