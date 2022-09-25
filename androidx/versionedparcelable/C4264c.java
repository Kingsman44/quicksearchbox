package androidx.versionedparcelable;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: androidx.versionedparcelable.c */
/* compiled from: PG */
final class C4264c extends ObjectInputStream implements InputStreamRetargetInterface {
    public C4264c(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
        if (cls != null) {
            return cls;
        }
        return super.resolveClass(objectStreamClass);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
