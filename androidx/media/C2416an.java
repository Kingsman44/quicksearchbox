package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.p060c.C0977g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media.an */
/* compiled from: PG */
public abstract class C2416an extends Service {

    /* renamed from: a */
    static final boolean f6685a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final ArrayList f6686b = new ArrayList();

    /* renamed from: c */
    final C0977g f6687c = new C0977g();

    /* renamed from: d */
    final C2415am f6688d = new C2415am(this);

    /* renamed from: e */
    public MediaSessionCompat.Token f6689e;

    /* renamed from: f */
    private C2441r f6690f;

    public C2416an() {
        new C2436m(this, "android.media.session.MediaController", -1, -1, (C2414al) null);
    }

    /* renamed from: d */
    static final List m6440d(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = -1;
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 != -1) {
            i = i2;
        } else if (i3 == -1) {
            return list;
        }
        int i4 = i3 * i;
        int i5 = i4 + i3;
        if (i < 0 || i3 <= 0 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    /* renamed from: f */
    public static final void m6441f(C2449z zVar) {
        zVar.f6745h = 2;
        zVar.mo5863c((Object) null);
    }

    /* renamed from: a */
    public final void mo5830a(String str) {
        if (str != null) {
            C2441r rVar = this.f6690f;
            rVar.f6733b.notifyChildrenChanged(str);
            rVar.f6735d.f6688d.post(new C2439p(rVar, str));
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    /* renamed from: b */
    public abstract void mo5831b(String str, C2449z zVar);

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public final void mo5833e(String str, C2449z zVar) {
        zVar.f6745h = 1;
        mo5831b(str, zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo5834g(String str, C2436m mVar, Bundle bundle) {
        C2431h hVar = new C2431h(this, str, mVar, str, bundle);
        if (bundle == null) {
            mo5831b(str, hVar);
        } else {
            mo5833e(str, hVar);
        }
        if (!hVar.mo5864d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + mVar.f6719a + " id=" + str);
        }
    }

    /* renamed from: h */
    public abstract C2434k mo5835h(String str, int i);

    /* renamed from: iP */
    public final void mo5836iP(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.f6689e == null) {
            this.f6689e = token;
            C2441r rVar = this.f6690f;
            rVar.f6735d.f6688d.mo5827a(new C2437n(rVar, token));
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f6690f.f6733b.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        C2448y yVar = new C2448y(this);
        this.f6690f = yVar;
        C2447x xVar = yVar;
        xVar.f6733b = new C2446w(xVar, xVar.f6740e);
        xVar.f6733b.onCreate();
    }
}
