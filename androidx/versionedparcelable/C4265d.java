package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.p060c.C0984n;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: androidx.versionedparcelable.d */
/* compiled from: PG */
public abstract class C4265d {

    /* renamed from: a */
    final C0984n f13773a;

    /* renamed from: b */
    final C0984n f13774b;

    /* renamed from: c */
    final C0984n f13775c;

    public C4265d(C0984n nVar, C0984n nVar2, C0984n nVar3) {
        this.f13773a = nVar;
        this.f13774b = nVar2;
        this.f13775c = nVar3;
    }

    /* renamed from: G */
    private final Class m12182G(Class cls) {
        Class cls2 = (Class) this.f13775c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f13775c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: A */
    public final void mo9090A(C4267f fVar) {
        if (fVar != null) {
            try {
                mo9120y(m12182G(fVar.getClass()).getName());
                C4265d h = mo9103h();
                try {
                    Class<?> cls = fVar.getClass();
                    Method method = (Method) this.f13774b.get(cls.getName());
                    if (method == null) {
                        method = m12182G(cls).getDeclaredMethod("write", new Class[]{cls, C4265d.class});
                        this.f13774b.put(cls.getName(), method);
                    }
                    method.invoke((Object) null, new Object[]{fVar, h});
                    h.mo9110o();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(String.valueOf(fVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
            }
        } else {
            mo9120y((String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract boolean mo9091B();

    /* renamed from: C */
    public final boolean mo9092C(boolean z, int i) {
        if (!mo9093D(i)) {
            return z;
        }
        return mo9091B();
    }

    /* renamed from: D */
    public abstract boolean mo9093D(int i);

    /* renamed from: E */
    public abstract byte[] mo9094E();

    /* renamed from: F */
    public final Object[] mo9095F(Object[] objArr, int i) {
        Serializable serializable;
        if (!mo9093D(i)) {
            return objArr;
        }
        int a = mo9096a();
        if (a < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a);
        if (a != 0) {
            int a2 = mo9096a();
            if (a2 == 1) {
                while (a > 0) {
                    arrayList.add(mo9104i());
                    a--;
                }
            } else if (a2 == 2) {
                while (a > 0) {
                    arrayList.add(mo9101f());
                    a--;
                }
            } else if (a2 == 3) {
                while (a > 0) {
                    String m = mo9108m();
                    if (m == null) {
                        serializable = null;
                    } else {
                        try {
                            serializable = (Serializable) new C4264c(new ByteArrayInputStream(mo9094E())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + m + ")", e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + m + ")", e2);
                        }
                    }
                    arrayList.add(serializable);
                    a--;
                }
            } else if (a2 == 4) {
                while (a > 0) {
                    arrayList.add(mo9108m());
                    a--;
                }
            } else if (a2 == 5) {
                while (a > 0) {
                    arrayList.add(mo9100e());
                    a--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9096a();

    /* renamed from: b */
    public final int mo9097b(int i, int i2) {
        if (!mo9093D(i2)) {
            return i;
        }
        return mo9096a();
    }

    /* renamed from: c */
    public abstract long mo9098c();

    /* renamed from: d */
    public abstract Bundle mo9099d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract IBinder mo9100e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Parcelable mo9101f();

    /* renamed from: g */
    public final Parcelable mo9102g(Parcelable parcelable, int i) {
        if (!mo9093D(i)) {
            return parcelable;
        }
        return mo9101f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C4265d mo9103h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C4267f mo9104i() {
        Class<C4265d> cls = C4265d.class;
        String m = mo9108m();
        if (m == null) {
            return null;
        }
        C4265d h = mo9103h();
        try {
            Method method = (Method) this.f13773a.get(m);
            if (method == null) {
                method = Class.forName(m, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.f13773a.put(m, method);
            }
            return (C4267f) method.invoke((Object) null, new Object[]{h});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: j */
    public final C4267f mo9105j(C4267f fVar, int i) {
        if (!mo9093D(i)) {
            return fVar;
        }
        return mo9104i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo9106k();

    /* renamed from: l */
    public final CharSequence mo9107l(CharSequence charSequence, int i) {
        if (!mo9093D(i)) {
            return charSequence;
        }
        return mo9106k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo9108m();

    /* renamed from: n */
    public final String mo9109n(String str, int i) {
        if (!mo9093D(i)) {
            return str;
        }
        return mo9108m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo9110o();

    /* renamed from: p */
    public abstract void mo9111p(int i);

    /* renamed from: q */
    public final void mo9112q(Object[] objArr) {
        int i;
        if (objArr == null) {
            mo9117v(-1);
            return;
        }
        int length = objArr.length;
        mo9117v(length);
        if (length > 0) {
            int i2 = 0;
            Object obj = objArr[0];
            if (obj instanceof String) {
                i = 4;
            } else if (obj instanceof Parcelable) {
                i = 2;
            } else if (obj instanceof C4267f) {
                i = 1;
            } else if (obj instanceof Serializable) {
                i = 3;
            } else if (obj instanceof IBinder) {
                i = 5;
            } else if (obj instanceof Integer) {
                i = 7;
            } else if (obj instanceof Float) {
                i = 8;
            } else {
                throw new IllegalArgumentException(String.valueOf(obj.getClass().getName()).concat(" cannot be VersionedParcelled"));
            }
            mo9117v(i);
            if (i == 1) {
                while (i2 < length) {
                    mo9090A(objArr[i2]);
                    i2++;
                }
            } else if (i == 2) {
                while (i2 < length) {
                    mo9119x(objArr[i2]);
                    i2++;
                }
            } else if (i == 3) {
                while (i2 < length) {
                    Serializable serializable = objArr[i2];
                    if (serializable == null) {
                        mo9120y((String) null);
                    } else {
                        String name = serializable.getClass().getName();
                        mo9120y(name);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(serializable);
                            objectOutputStream.close();
                            mo9115t(byteArrayOutputStream.toByteArray());
                        } catch (IOException e) {
                            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
                        }
                    }
                    i2++;
                }
            } else if (i == 4) {
                while (i2 < length) {
                    mo9120y(objArr[i2]);
                    i2++;
                }
            } else if (i == 5) {
                while (i2 < length) {
                    mo9121z(objArr[i2]);
                    i2++;
                }
            }
        }
    }

    /* renamed from: r */
    public abstract void mo9113r(boolean z);

    /* renamed from: s */
    public abstract void mo9114s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo9115t(byte[] bArr);

    /* renamed from: u */
    public abstract void mo9116u(CharSequence charSequence);

    /* renamed from: v */
    public abstract void mo9117v(int i);

    /* renamed from: w */
    public abstract void mo9118w(long j);

    /* renamed from: x */
    public abstract void mo9119x(Parcelable parcelable);

    /* renamed from: y */
    public abstract void mo9120y(String str);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo9121z(IBinder iBinder);
}
