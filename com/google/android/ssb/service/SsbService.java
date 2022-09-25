package com.google.android.ssb.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.hotword.service.C146591i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.ssb.C45351h;
import com.google.android.ssb.C45352i;
import com.google.android.ssb.C45353j;
import com.google.android.ssb.C45354k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class SsbService extends C45356b {

    /* renamed from: a */
    public static final C59071e f118566a = C59071e.m91332i("com.google.android.ssb.service.SsbService");

    /* renamed from: b */
    public final C45363i f118567b = C45363i.f118607b;

    /* renamed from: c */
    public boolean f118568c;

    /* renamed from: d */
    public C21370a f118569d;

    /* renamed from: e */
    public C86124t f118570e;

    /* renamed from: f */
    public C86127w f118571f;

    /* renamed from: g */
    public C68214a f118572g;

    /* renamed from: h */
    public C68214a f118573h;

    /* renamed from: i */
    public C68214a f118574i;

    /* renamed from: j */
    public C68214a f118575j;

    /* renamed from: k */
    public C69464a f118576k;

    /* renamed from: l */
    public C68214a f118577l;

    /* renamed from: m */
    public C68214a f118578m;

    /* renamed from: n */
    public C90476a f118579n;

    /* renamed from: o */
    public C58833ax f118580o;

    /* renamed from: p */
    final ServiceConnection f118581p = new C45359e(this);

    /* renamed from: q */
    C146591i f118582q;

    /* renamed from: r */
    boolean f118583r = false;

    /* renamed from: s */
    boolean f118584s = false;

    /* renamed from: t */
    boolean f118585t;

    /* renamed from: u */
    boolean f118586u;

    /* renamed from: v */
    boolean f118587v;

    /* renamed from: w */
    long f118588w = -1;

    /* renamed from: x */
    private final Messenger f118589x = new Messenger(new C45360f(this));

    /* renamed from: y */
    private C45355a f118590y;

    public SsbService() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    /* renamed from: e */
    public static void m80862e(String str, String str2) {
        C22872h.m42743c(C86593a.class);
        C45363i iVar = C45363i.f118607b;
        C45353j jVar = (C45353j) C45354k.f118561d.createBuilder();
        jVar.copyOnWrite();
        C45354k kVar = (C45354k) jVar.instance;
        str.getClass();
        kVar.f118563a |= 1;
        kVar.f118564b = str;
        jVar.copyOnWrite();
        C45354k kVar2 = (C45354k) jVar.instance;
        str2.getClass();
        kVar2.f118563a |= 2;
        kVar2.f118565c = str2;
        C45354k kVar3 = (C45354k) jVar.build();
        synchronized (iVar.f118609d) {
            C45351h hVar = (C45351h) iVar.f118610e.toBuilder();
            hVar.copyOnWrite();
            C45352i iVar2 = (C45352i) hVar.instance;
            kVar3.getClass();
            iVar2.f118557g = kVar3;
            iVar2.f118551a |= 64;
            iVar.f118610e = (C45352i) hVar.build();
        }
        iVar.mo49380g();
    }

    /* renamed from: g */
    public static void m80863g(int i) {
        C22872h.m42743c(C86593a.class);
        C45363i iVar = C45363i.f118607b;
        synchronized (iVar.f118609d) {
            C45351h hVar = (C45351h) iVar.f118610e.toBuilder();
            hVar.copyOnWrite();
            C45352i iVar2 = (C45352i) hVar.instance;
            iVar2.f118558h = i - 1;
            iVar2.f118551a |= 128;
            iVar.f118610e = (C45352i) hVar.build();
        }
        iVar.mo49380g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49361b() {
        boolean z = false;
        if (this.f118586u && (this.f118587v || this.f118569d.mo26871c() < this.f118588w)) {
            z = true;
        }
        mo49364f(z);
    }

    /* renamed from: d */
    public final void mo49362d(boolean z) {
        C146591i iVar;
        ((C59052c) ((C59052c) f118566a.mo56224b()).mo56372aa(54366)).mo56389s("Requesting hotword detection. Enabled: %b.", Boolean.valueOf(z));
        if (z != this.f118584s && (iVar = this.f118582q) != null) {
            try {
                iVar.mo123393e(getPackageName(), z);
                this.f118584s = z;
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) f118566a.mo56226d()).mo56382g(e)).mo56372aa(54367)).mo56386p("requestHotwordDetection - remote call failed");
            }
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        C91006f f = C91006f.m148645f(this.f118579n);
        f.mo85291r("SsbService");
        f.mo85286m(this.f118567b);
        f.mo85295u(printWriter, BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo49364f(boolean z) {
        this.f118567b.mo49381h(new C45358d(this, z));
    }

    public final IBinder onBind(Intent intent) {
        return this.f118589x.getBinder();
    }

    public final void onCreate() {
        super.onCreate();
        this.f118567b.mo49384k(getApplicationContext(), this.f118571f, this.f118570e, this.f118572g, this.f118574i, this.f118575j, this.f118577l, this.f118578m, this.f118580o);
        this.f118568c = true;
        this.f118585t = this.f118571f.f232790a.mo79722a().getBoolean("hotword_navigation_requirement_met", false);
        C45355a aVar = new C45355a(this);
        this.f118590y = aVar;
        registerReceiver(aVar, new IntentFilter("com.google.android.apps.gmm.NAVIGATION_STATE"));
    }

    public final void onDestroy() {
        this.f118568c = false;
        this.f118567b.mo49378b();
        unregisterReceiver(this.f118590y);
        if (this.f118583r) {
            unbindService(this.f118581p);
            this.f118583r = false;
        }
        super.onDestroy();
    }
}
