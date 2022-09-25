package com.google.speech.grammar.pumpkin;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class UserValidators {
    private final Object deleteLock;
    private Map javaValidators;
    private long nativeUserValidators;

    public UserValidators(C66516h hVar) {
        this(hVar.toByteArray());
    }

    private native void nativeAddGoldmineValidator(long j, String str, String str2, int i);

    private native void nativeAddJavaValidator(long j, String str);

    private native void nativeAddMapBasedValidator(long j, String str, String[] strArr, String[] strArr2);

    private native void nativeAddUserValidator(long j, String str, String[] strArr);

    private native long nativeCreate(byte[] bArr);

    private native void nativeDelete(long j);

    private native void nativeSetContacts(long j, String[] strArr);

    public synchronized void addGoldmineUserValidator(String str, String str2, int i) {
        nativeAddGoldmineValidator(this.nativeUserValidators, str, str2, i);
    }

    @Deprecated
    public synchronized void addNativeValidator(String str, String str2) {
        nativeAddGoldmineValidator(this.nativeUserValidators, str, str2, 0);
    }

    public synchronized void addUserValidator(String str, String[] strArr) {
        nativeAddUserValidator(this.nativeUserValidators, str, strArr);
    }

    public synchronized void addUserValidatorFromMap(String str, Map map) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        nativeAddMapBasedValidator(this.nativeUserValidators, str, strArr, strArr2);
    }

    public synchronized void addValidator(String str, C66528t tVar) {
        nativeAddJavaValidator(this.nativeUserValidators, str);
        this.javaValidators.put(str, tVar);
    }

    public String canonicalize(String str, String str2) {
        C66528t tVar = (C66528t) this.javaValidators.get(str);
        if (tVar != null) {
            return tVar.mo59674b(str2);
        }
        throw new NullPointerException("Java validator should exist at this point.");
    }

    public void delete() {
        synchronized (this.deleteLock) {
            long j = this.nativeUserValidators;
            if (j != 0) {
                nativeDelete(j);
                this.nativeUserValidators = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public long getNativeUserValidators() {
        return this.nativeUserValidators;
    }

    public float getPosterior(String str, String str2) {
        C66528t tVar = (C66528t) this.javaValidators.get(str);
        if (tVar != null) {
            return tVar.mo59673a(str2);
        }
        throw new NullPointerException("Java validator should exist at this point.");
    }

    public synchronized void setContacts(String[] strArr) {
        nativeSetContacts(this.nativeUserValidators, strArr);
    }

    public UserValidators(byte[] bArr) {
        this.deleteLock = new Object();
        this.nativeUserValidators = nativeCreate(bArr);
        this.javaValidators = new HashMap();
        if (this.nativeUserValidators == 0) {
            throw new NullPointerException("Couldn't create UserValidator native object from the provided config");
        }
    }
}
