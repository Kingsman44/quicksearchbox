package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.bl */
/* compiled from: PG */
abstract class C62932bl {

    /* renamed from: a */
    private static final Logger f169958a = Logger.getLogger(C62906an.class.getName());

    /* renamed from: b */
    private static final String f169959b = "com.google.protobuf.m";

    /* renamed from: b */
    static C62921ba m95423b(Class cls) {
        String str;
        Class<C62932bl> cls2 = C62932bl.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C62921ba.class)) {
            str = f169959b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C62921ba) cls.cast(((C62932bl) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo58866a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C62921ba) cls.cast(((C62932bl) it.next()).mo58866a()));
                } catch (ServiceConfigurationError e5) {
                    f169958a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C62921ba) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C62921ba) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C62921ba mo58866a();
}
