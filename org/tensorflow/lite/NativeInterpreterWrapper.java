package org.tensorflow.lite;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.nnapi.C72671a;

/* compiled from: PG */
public class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: a */
    public long f193242a;

    /* renamed from: b */
    public long f193243b;

    /* renamed from: c */
    public TensorImpl[] f193244c;

    /* renamed from: d */
    public TensorImpl[] f193245d;

    /* renamed from: e */
    public boolean f193246e = false;

    /* renamed from: f */
    private long f193247f;

    /* renamed from: g */
    private ByteBuffer f193248g;

    /* renamed from: h */
    private final List f193249h;

    /* renamed from: i */
    private final List f193250i;
    public long inferenceDurationNanoseconds = -1;

    public NativeInterpreterWrapper(ByteBuffer byteBuffer) {
        C72666c b;
        ByteBuffer byteBuffer2 = byteBuffer;
        ArrayList arrayList = new ArrayList();
        this.f193249h = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f193250i = arrayList2;
        TensorFlowLite.m107466a();
        if (byteBuffer2 != null) {
            this.f193248g = byteBuffer2;
            long createErrorReporter = createErrorReporter(512);
            long createModelWithBuffer = createModelWithBuffer(this.f193248g, createErrorReporter);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            this.f193242a = createErrorReporter;
            this.f193247f = createModelWithBuffer;
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = arrayList5;
            long createInterpreter = createInterpreter(createModelWithBuffer, createErrorReporter, -1, true, arrayList5);
            this.f193243b = createInterpreter;
            if (hasUnresolvedFlexOp(createInterpreter) && (b = m107464b(Collections.unmodifiableList(arrayList3))) != null) {
                arrayList2.add(b);
                arrayList.add(b);
            }
            for (C72666c add : Collections.unmodifiableList(arrayList3)) {
                this.f193249h.add(add);
            }
            for (C72667d a : Collections.unmodifiableList(arrayList4)) {
                C72666c a2 = a.mo64501a();
                this.f193250i.add(a2);
                this.f193249h.add(a2);
            }
            for (C72666c cVar : this.f193249h) {
                if (cVar instanceof C72671a) {
                    C72671a aVar = (C72671a) cVar;
                    throw null;
                }
            }
            ArrayList arrayList7 = arrayList6;
            arrayList7.ensureCapacity(this.f193249h.size());
            for (C72666c a3 : this.f193249h) {
                arrayList7.add(Long.valueOf(a3.mo64499a()));
            }
            if (!arrayList7.isEmpty()) {
                delete(0, 0, this.f193243b);
                this.f193243b = createInterpreter(createModelWithBuffer, createErrorReporter, -1, true, arrayList7);
            }
            this.f193244c = new TensorImpl[getInputCount(this.f193243b)];
            this.f193245d = new TensorImpl[getOutputCount(this.f193243b)];
            allocateTensors(this.f193243b, createErrorReporter);
            this.f193246e = true;
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }

    public static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    /* renamed from: b */
    private static C72666c m107464b(List list) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((C72666c) it.next())) {
                    return null;
                }
            }
            return (C72666c) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, List list);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native String[] getOutputNames(long j);

    public static native int getOutputTensorIndex(long j, int i);

    public static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    public static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    public static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    /* renamed from: a */
    public final TensorImpl mo64492a(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.f193244c;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.f193243b;
                TensorImpl c = TensorImpl.m107468c(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = c;
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i);
    }

    public final void close() {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.f193244c;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.mo64495d();
                this.f193244c[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.f193245d;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.mo64495d();
                this.f193245d[i2] = null;
            }
            i2++;
        }
        delete(this.f193242a, this.f193247f, this.f193243b);
        deleteCancellationFlag(0);
        this.f193242a = 0;
        this.f193247f = 0;
        this.f193243b = 0;
        this.f193248g = null;
        this.f193246e = false;
        this.f193249h.clear();
        for (C72666c close : this.f193250i) {
            close.close();
        }
        this.f193250i.clear();
    }
}
