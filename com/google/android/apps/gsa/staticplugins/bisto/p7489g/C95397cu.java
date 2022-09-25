package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.cu */
/* compiled from: PG */
public final class C95397cu {

    /* renamed from: a */
    private static final C59071e f266915a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.cu");

    /* renamed from: b */
    private final MediaSessionManager f266916b;

    public C95397cu(Context context) {
        this.f266916b = (MediaSessionManager) context.getSystemService("media_session");
    }

    /* renamed from: c */
    private static Class m157766c() {
        try {
            return Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
        } catch (ClassNotFoundException unused) {
            C59104x c = f266915a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
            ((C59052c) ((C59052c) c).mo56372aa(14988)).mo56386p("OnVolumeKeyLongPressListener not found");
            return null;
        }
    }

    /* renamed from: d */
    private static Class m157767d() {
        try {
            return Class.forName("android.media.session.MediaSessionManager$OnMediaKeyListener");
        } catch (ClassNotFoundException unused) {
            C59104x c = f266915a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
            ((C59052c) ((C59052c) c).mo56372aa(14989)).mo56386p("OnVolumeKeyLongPressListener not found");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89342a(boolean z) {
        C59104x b = f266915a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14990)).mo56386p("unregister()");
        Class c = m157766c();
        Class d = m157767d();
        if (c != null && z) {
            try {
                MediaSessionManager.class.getMethod("setOnVolumeKeyLongPressListener", new Class[]{c, Handler.class}).invoke(this.f266916b, new Object[]{null, null});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C59104x c2 = f266915a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(14992)).mo56386p("Can't remove volume key listener");
            }
        }
        if (d != null) {
            try {
                MediaSessionManager.class.getMethod("setOnMediaKeyListener", new Class[]{d, Handler.class}).invoke(this.f266916b, new Object[]{null, null});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                C59104x c3 = f266915a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(14991)).mo56386p("Can't remove media key listener");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo89343b(InvocationHandler invocationHandler, boolean z) {
        C59104x b = f266915a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14993)).mo56386p("register()");
        Class d = m157767d();
        Class[] clsArr = {m157766c(), d};
        if (!(clsArr[0] == null || d == null)) {
            Object newProxyInstance = Proxy.newProxyInstance(MediaSessionManager.class.getClassLoader(), clsArr, invocationHandler);
            if (z) {
                try {
                    MediaSessionManager.class.getMethod("setOnVolumeKeyLongPressListener", new Class[]{clsArr[0], Handler.class}).invoke(this.f266916b, new Object[]{newProxyInstance, null});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    C59104x c = f266915a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "MediaKeyRegistrationHelper");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14994)).mo56386p("Can't set listener");
                }
            }
            MediaSessionManager.class.getMethod("setOnMediaKeyListener", new Class[]{clsArr[1], Handler.class}).invoke(this.f266916b, new Object[]{newProxyInstance, null});
            return true;
        }
        return false;
    }
}
