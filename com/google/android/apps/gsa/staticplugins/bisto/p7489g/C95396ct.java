package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.view.KeyEvent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ct */
/* compiled from: PG */
final class C95396ct implements InvocationHandler {

    /* renamed from: a */
    public static final C59071e f266912a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.ct");

    /* renamed from: b */
    public final C95397cu f266913b;

    /* renamed from: c */
    public final C95403d f266914c;

    public C95396ct(C95397cu cuVar, C95403d dVar) {
        this.f266914c = dVar;
        this.f266913b = cuVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C59071e eVar = f266912a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LegacyBtInputRouter");
        ((C59052c) ((C59052c) b).mo56372aa(14985)).mo56389s("invoke: method name: %s", method.getName());
        if (objArr.length > 0) {
            boolean z = false;
            KeyEvent keyEvent = objArr[0];
            if (keyEvent instanceof KeyEvent) {
                KeyEvent keyEvent2 = keyEvent;
                if (method.getName().equals("onMediaKey")) {
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "LegacyBtInputRouter");
                    ((C59052c) ((C59052c) b2).mo56372aa(14987)).mo56389s("MediaKey event received: %s", keyEvent2);
                    if ((keyEvent2.getKeyCode() == 79 || keyEvent2.getKeyCode() == 85) && (keyEvent2.getFlags() & 1073741824) != 1073741824) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }
}
