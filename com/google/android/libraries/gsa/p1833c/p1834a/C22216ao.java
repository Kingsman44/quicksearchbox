package com.google.android.libraries.gsa.p1833c.p1834a;

import android.content.Context;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.CronetProvider;

/* renamed from: com.google.android.libraries.gsa.c.a.ao */
/* compiled from: PG */
public final class C22216ao {

    /* renamed from: a */
    private static final C59071e f61341a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.ao");

    /* renamed from: b */
    private static final C58495hd f61342b = C58495hd.m89902p(CronetProvider.PROVIDER_NAME_APP_PACKAGED, "org.chromium.net.impl.NativeCronetProvider", "Google-Play-Services-Cronet-Provider", "com.google.android.gms.net.GmsCoreCronetProvider", CronetProvider.PROVIDER_NAME_FALLBACK, "org.chromium.net.impl.JavaCronetProvider");

    /* renamed from: b */
    private static CronetProvider m41555b(Context context, String str) {
        String str2 = (String) f61342b.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            CronetProvider cronetProvider = (CronetProvider) Class.forName(str2).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            if (cronetProvider.isEnabled()) {
                return cronetProvider;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            ((C59052c) ((C59052c) ((C59052c) f61341a.mo56225c()).mo56382g(e)).mo56372aa(48474)).mo56389s("Can't load %s", str2);
        }
    }

    /* renamed from: a */
    public final CronetProvider mo27470a(Context context, String str) {
        try {
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(context)) {
                if (cronetProvider.getName().equals(str) && cronetProvider.isEnabled()) {
                    return cronetProvider;
                }
            }
            return null;
        } catch (RuntimeException unused) {
            return m41555b(context, str);
        }
    }
}
