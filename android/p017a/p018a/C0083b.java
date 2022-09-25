package android.p017a.p018a;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* renamed from: android.a.a.b */
/* compiled from: PG */
public final class C0083b {

    /* renamed from: a */
    private static final Properties f228a;

    static {
        InputStream inputStream;
        Properties properties = new Properties();
        f228a = properties;
        Class<C0085d> cls = C0085d.class;
        try {
            if (System.getSecurityManager() != null) {
                inputStream = (InputStream) AccessController.doPrivileged(new C0084c(cls));
            } else {
                inputStream = cls.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }

    /* renamed from: a */
    public static String m35a() {
        String str;
        if (System.getSecurityManager() != null) {
            try {
                str = (String) AccessController.doPrivileged(new C0082a());
            } catch (AccessControlException unused) {
                str = null;
            }
        } else {
            str = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        return str == null ? f228a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL") : str;
    }
}
