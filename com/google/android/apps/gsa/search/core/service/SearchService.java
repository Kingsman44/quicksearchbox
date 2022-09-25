package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import android.os.IBinder;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87666a;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87672g;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p3186j$.time.Duration;

/* compiled from: PG */
public class SearchService extends C86778u {

    /* renamed from: a */
    public static final C59071e f233935a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.SearchService");

    /* renamed from: b */
    C86611ag f233936b;

    /* renamed from: c */
    C87666a f233937c;

    /* renamed from: d */
    public C91022f f233938d;

    /* renamed from: e */
    public C90476a f233939e;

    /* renamed from: f */
    public C58833ax f233940f;

    /* renamed from: g */
    public C38802e f233941g;

    /* renamed from: h */
    public C21370a f233942h;

    /* renamed from: i */
    public C87672g f233943i;

    /* renamed from: b */
    private final C87666a m139486b() {
        if (this.f233937c == null) {
            this.f233937c = this.f233943i.mo81928a();
        }
        return this.f233937c;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C91006f f = C91006f.m148645f(this.f233939e);
        f.mo85286m(this.f233938d);
        f.mo85295u(printWriter, BuildConfig.FLAVOR);
    }

    public final IBinder onBind(Intent intent) {
        C89949q.m146523g(556);
        if (this.f233936b == null) {
            this.f233936b = new C86611ag(m139486b());
        }
        return this.f233936b;
    }

    public final void onCreate() {
        C74507e.m120466b(17);
        super.onCreate();
        long d = this.f233942h.mo26872d();
        if (this.f233940f.mo56113h()) {
            ((C89922b) this.f233940f.mo56107c()).mo83764h(C89849ae.SEARCH_SERVICE_ON_CREATE, Duration.ofNanos(d).toMillis());
        }
        this.f233941g.mo41630d(C37248a.f98968j.mo40811d(d));
    }

    public final void onDestroy() {
        this.f233943i.mo81929b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m139486b().mo80250p();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m139486b().mo80237b(intent);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        m139486b().mo80249o(i);
    }

    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }
}
