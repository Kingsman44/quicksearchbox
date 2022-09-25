package android.support.p031v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.p031v4.media.session.C0303e;
import android.support.p031v4.media.session.C0306h;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C1826m;
import androidx.media.C2430g;
import androidx.p060c.C0977g;
import java.util.List;

/* renamed from: android.support.v4.media.i */
/* compiled from: PG */
class C0272i implements C0269f, C0275l, C0267d {

    /* renamed from: a */
    final Context f958a;

    /* renamed from: b */
    protected final MediaBrowser f959b;

    /* renamed from: c */
    protected final Bundle f960c;

    /* renamed from: d */
    protected final C0265b f961d = new C0265b(this);

    /* renamed from: e */
    public final C0977g f962e = new C0977g();

    /* renamed from: f */
    protected int f963f;

    /* renamed from: g */
    protected C0278o f964g;

    /* renamed from: h */
    protected Messenger f965h;

    /* renamed from: i */
    public MediaSessionCompat.Token f966i;

    public C0272i(Context context, ComponentName componentName, C0268e eVar, Bundle bundle) {
        this.f958a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f960c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        eVar.f955b = this;
        this.f959b = new MediaBrowser(context, componentName, eVar.f954a, bundle2);
    }

    /* renamed from: a */
    public final void mo837a() {
        C0306h hVar;
        try {
            Bundle extras = this.f959b.getExtras();
            if (extras != null) {
                this.f963f = extras.getInt("extra_service_version", 0);
                IBinder a = C1826m.m5004a(extras, "extra_messenger");
                if (a != null) {
                    this.f964g = new C0278o(a, this.f960c);
                    Messenger messenger = new Messenger(this.f961d);
                    this.f965h = messenger;
                    this.f961d.mo832a(messenger);
                    try {
                        C0278o oVar = this.f964g;
                        Context context = this.f958a;
                        Messenger messenger2 = this.f965h;
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putInt("data_calling_pid", Process.myPid());
                        bundle.putBundle("data_root_hints", oVar.f967a);
                        oVar.mo851a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IBinder a2 = C1826m.m5004a(extras, "extra_session_binder");
                if (a2 == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = a2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    hVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0306h)) ? new C0303e(a2) : (C0306h) queryLocalInterface;
                }
                if (hVar != null) {
                    this.f966i = MediaSessionCompat.Token.fromToken(this.f959b.getSessionToken(), hVar);
                }
            }
        } catch (IllegalStateException e) {
            Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
        }
    }

    /* renamed from: b */
    public final void mo838b() {
        this.f964g = null;
        this.f965h = null;
        this.f966i = null;
        this.f961d.mo832a((Messenger) null);
    }

    /* renamed from: c */
    public final void mo844c() {
    }

    /* renamed from: d */
    public final void mo845d(Messenger messenger, String str, List list, Bundle bundle) {
        C0282s sVar;
        if (this.f965h == messenger) {
            C0279p pVar = (C0279p) this.f962e.get(str);
            if (pVar != null) {
                int i = 0;
                while (true) {
                    if (i >= pVar.f970b.size()) {
                        sVar = null;
                        break;
                    } else if (C2430g.m6455a((Bundle) pVar.f970b.get(i), bundle)) {
                        sVar = (C0282s) pVar.f969a.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (sVar != null && bundle == null) {
                    if (list == null) {
                        sVar.mo857b(str);
                    } else {
                        sVar.mo856a(str, list);
                    }
                }
            } else if (MediaBrowserCompat.f927a) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=".concat(String.valueOf(str)));
            }
        }
    }

    /* renamed from: e */
    public final void mo846e() {
    }
}
