package org.chromium.net;

/* renamed from: org.chromium.net.j */
/* compiled from: PG */
final class C72545j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkChangeNotifierAutoDetect f193055a;

    public C72545j(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f193055a = networkChangeNotifierAutoDetect;
    }

    public final void run() {
        if (this.f193055a.mIgnoreNextBroadcast) {
            this.f193055a.mIgnoreNextBroadcast = false;
        } else {
            this.f193055a.connectionTypeChanged();
        }
    }
}
