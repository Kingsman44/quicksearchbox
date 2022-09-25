package com.google.android.apps.gsa.shared.util.p7158b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.b.a */
/* compiled from: PG */
public final class C90744a {

    /* renamed from: a */
    private static final C59071e f253819a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.b.a");

    /* renamed from: a */
    public static String m148217a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Error | Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f253819a.mo56225c()).mo56382g(e)).mo56372aa(11355)).mo56389s("Unable to read property %s.", str);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m148218b() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Boolean bool = (Boolean) cls.getMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}).invoke(cls, new Object[]{"ro.opa.eligible_device", false});
            bool.getClass();
            return bool.booleanValue();
        } catch (Error | Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f253819a.mo56225c()).mo56382g(e)).mo56372aa(11356)).mo56389s("Unable to read property %s.", "ro.opa.eligible_device");
            return false;
        }
    }

    /* renamed from: c */
    public static int m148219c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Integer num = (Integer) cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(cls, new Object[]{"persist.gsa.loopback_channel_count", 2});
            num.getClass();
            return num.intValue();
        } catch (Error | Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f253819a.mo56225c()).mo56382g(e)).mo56372aa(11354)).mo56389s("Unable to read property %s.", "persist.gsa.loopback_channel_count");
            return 2;
        }
    }
}
