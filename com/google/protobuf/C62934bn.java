package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.bn */
/* compiled from: PG */
public class C62934bn extends C62919b {
    private final C62942bv defaultInstance;
    public C62942bv instance;
    protected boolean isBuilt = false;

    protected C62934bn(C62942bv bvVar) {
        this.defaultInstance = bvVar;
        this.instance = (C62942bv) bvVar.dynamicMethod(C62941bu.NEW_MUTABLE_INSTANCE);
    }

    private void mergeFromInstance(C62942bv bvVar, C62942bv bvVar2) {
        C63013ee.f170090a.mo59017a(bvVar.getClass()).mo58997g(bvVar, bvVar2);
    }

    public final C62942bv build() {
        C62942bv buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw newUninitializedMessageException(buildPartial);
    }

    public C62942bv buildPartial() {
        if (this.isBuilt) {
            return this.instance;
        }
        this.instance.makeImmutable();
        this.isBuilt = true;
        return this.instance;
    }

    public final C62934bn clear() {
        this.instance = (C62942bv) this.instance.dynamicMethod(C62941bu.NEW_MUTABLE_INSTANCE);
        return this;
    }

    public final void copyOnWrite() {
        if (this.isBuilt) {
            copyOnWriteInternal();
            this.isBuilt = false;
        }
    }

    /* access modifiers changed from: protected */
    public void copyOnWriteInternal() {
        C62942bv bvVar = (C62942bv) this.instance.dynamicMethod(C62941bu.NEW_MUTABLE_INSTANCE);
        mergeFromInstance(bvVar, this.instance);
        this.instance = bvVar;
    }

    public C62942bv getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public final boolean isInitialized() {
        return C62942bv.isInitialized(this.instance, false);
    }

    public C62934bn clone() {
        C62934bn newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.mergeFrom(buildPartial());
        return newBuilderForType;
    }

    /* access modifiers changed from: protected */
    public C62934bn internalMergeFrom(C62942bv bvVar) {
        return mergeFrom(bvVar);
    }

    public C62934bn mergeFrom(C62897ae aeVar, C62921ba baVar) {
        copyOnWrite();
        try {
            C63013ee.f170090a.mo59017a(this.instance.getClass()).mo58998h(this.instance, C62898af.m95150p(aeVar), baVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public C62934bn mergeFrom(C62942bv bvVar) {
        copyOnWrite();
        mergeFromInstance(this.instance, bvVar);
        return this;
    }

    public C62934bn mergeFrom(byte[] bArr, int i, int i2) {
        return mergeFrom(bArr, i, i2, C62921ba.f169869a);
    }

    public C62934bn mergeFrom(byte[] bArr, int i, int i2, C62921ba baVar) {
        copyOnWrite();
        try {
            C63013ee.f170090a.mo59017a(this.instance.getClass()).mo58999i(this.instance, bArr, i, i + i2, new C63071i(baVar));
            return this;
        } catch (C62974ct e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C62974ct.m95559i();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }
}
