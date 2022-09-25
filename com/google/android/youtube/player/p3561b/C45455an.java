package com.google.android.youtube.player.p3561b;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.youtube.player.b.an */
public final class C45455an {
    /* renamed from: a */
    public static IBinder m81109a(Class cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class}).newInstance(new Object[]{iBinder, iBinder2, iBinder3});
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(cls.getName());
            throw new C45454am(valueOf.length() != 0 ? "Could not find the right constructor for ".concat(valueOf) : new String("Could not find the right constructor for "), e);
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new C45454am(valueOf2.length() != 0 ? "Exception thrown by invoked constructor in ".concat(valueOf2) : new String("Exception thrown by invoked constructor in "), e2);
        } catch (InstantiationException e3) {
            String valueOf3 = String.valueOf(cls.getName());
            throw new C45454am(valueOf3.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf3) : new String("Unable to instantiate the dynamic class "), e3);
        } catch (IllegalAccessException e4) {
            String valueOf4 = String.valueOf(cls.getName());
            throw new C45454am(valueOf4.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf4) : new String("Unable to call the default constructor of "), e4);
        }
    }
}
