package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.bv */
/* compiled from: PG */
public abstract class C62942bv extends C62947c {
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C63045fj unknownFields = C63045fj.f170156a;

    /* access modifiers changed from: private */
    public static C62940bt checkIsLite(C62917ay ayVar) {
        return (C62940bt) ayVar;
    }

    private static C62942bv checkMessageInitialized(C62942bv bvVar) {
        if (bvVar == null || bvVar.isInitialized()) {
            return bvVar;
        }
        throw bvVar.newUninitializedMessageException().mo59085a();
    }

    protected static C62955cb emptyBooleanList() {
        return C63078p.f170231b;
    }

    protected static C62956cc emptyDoubleList() {
        return C62908ap.f169855b;
    }

    public static C62960cg emptyFloatList() {
        return C62929bi.f169952b;
    }

    public static C62961ch emptyIntList() {
        return C62954ca.f169992b;
    }

    public static C62964ck emptyLongList() {
        return C62989dh.f170046b;
    }

    public static C62971cq emptyProtobufList() {
        return C63014ef.f170093b;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C63045fj.f170156a) {
            this.unknownFields = new C63045fj();
        }
    }

    protected static C62925be fieldInfo(Field field, int i, C62928bh bhVar) {
        return fieldInfo(field, i, bhVar, false);
    }

    protected static C62925be fieldInfoForMap(Field field, int i, Object obj, C62959cf cfVar) {
        if (field == null) {
            return null;
        }
        Object obj2 = obj;
        C62972cr.m95549i(obj2, "mapDefaultEntry");
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        return new C62925be(field, i, C62928bh.MAP, (Class) null, (Field) null, 0, false, true, (C63009ea) null, (Class) null, obj2, cfVar);
    }

    protected static C62925be fieldInfoForOneofEnum(int i, Object obj, Class cls, C62959cf cfVar) {
        if (obj == null) {
            return null;
        }
        return C62925be.m95394a(i, C62928bh.ENUM, (C63009ea) obj, cls, false, cfVar);
    }

    protected static C62925be fieldInfoForOneofMessage(int i, C62928bh bhVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return C62925be.m95394a(i, bhVar, (C63009ea) obj, cls, false, (C62959cf) null);
    }

    protected static C62925be fieldInfoForOneofPrimitive(int i, C62928bh bhVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return C62925be.m95394a(i, bhVar, (C63009ea) obj, cls, false, (C62959cf) null);
    }

    protected static C62925be fieldInfoForOneofString(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        return C62925be.m95394a(i, C62928bh.STRING, (C63009ea) obj, String.class, z, (C62959cf) null);
    }

    public static C62925be fieldInfoForProto2Optional(Field field, int i, C62928bh bhVar, Field field2, int i2, boolean z, C62959cf cfVar) {
        Field field3 = field2;
        if (field == null || field3 == null) {
            return null;
        }
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        C62972cr.m95549i(bhVar, "fieldType");
        C62972cr.m95549i(field3, "presenceField");
        if (C62925be.m95396c(i2)) {
            return new C62925be(field, i, bhVar, (Class) null, field2, i2, false, z, (C63009ea) null, (Class) null, (Object) null, cfVar);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static C62925be fieldInfoForProto2Required(Field field, int i, C62928bh bhVar, Field field2, int i2, boolean z, C62959cf cfVar) {
        Field field3 = field2;
        if (field == null || field3 == null) {
            return null;
        }
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        C62972cr.m95549i(bhVar, "fieldType");
        C62972cr.m95549i(field3, "presenceField");
        if (C62925be.m95396c(i2)) {
            return new C62925be(field, i, bhVar, (Class) null, field2, i2, true, z, (C63009ea) null, (Class) null, (Object) null, cfVar);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    protected static C62925be fieldInfoForRepeatedMessage(Field field, int i, C62928bh bhVar, Class cls) {
        if (field == null) {
            return null;
        }
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        C62928bh bhVar2 = bhVar;
        C62972cr.m95549i(bhVar2, "fieldType");
        Class cls2 = cls;
        C62972cr.m95549i(cls2, "messageClass");
        return new C62925be(field, i, bhVar2, cls2, (Field) null, 0, false, false, (C63009ea) null, (Class) null, (Object) null, (C62959cf) null);
    }

    protected static C62925be fieldInfoWithEnumVerifier(Field field, int i, C62928bh bhVar, C62959cf cfVar) {
        if (field == null) {
            return null;
        }
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        return new C62925be(field, i, bhVar, (Class) null, (Field) null, 0, false, false, (C63009ea) null, (Class) null, (Object) null, cfVar);
    }

    static C62942bv getDefaultInstance(Class cls) {
        C62942bv bvVar = (C62942bv) defaultInstanceMap.get(cls);
        if (bvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bvVar = (C62942bv) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (bvVar == null) {
            bvVar = ((C62942bv) C63054fs.m95963b(cls)).getDefaultInstanceForType();
            if (bvVar != null) {
                defaultInstanceMap.put(cls, bvVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return bvVar;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object[] newFieldInfoArray(int i) {
        return new C62925be[i];
    }

    protected static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new C63015eg(messageLite, str, objArr);
    }

    protected static C62998dq newMessageInfoForMessageSet(C63012ed edVar, int[] iArr, Object[] objArr, Object obj) {
        return new C63039fd(edVar, true, iArr, (C62925be[]) objArr, obj);
    }

    protected static C63009ea newOneofInfo(int i, Field field, Field field2) {
        if (field == null || field2 == null) {
            return null;
        }
        return new C63009ea(field, field2);
    }

    public static C62940bt newRepeatedGeneratedExtension(MessageLite messageLite, MessageLite messageLite2, C62958ce ceVar, int i, C63066gd gdVar, boolean z, Class cls) {
        return new C62940bt(messageLite, Collections.emptyList(), messageLite2, new C62939bs(ceVar, i, gdVar, true, z));
    }

    public static C62940bt newSingularGeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, C62958ce ceVar, int i, C63066gd gdVar, Class cls) {
        return new C62940bt(messageLite, obj, messageLite2, new C62939bs(ceVar, i, gdVar, false, false));
    }

    public static C62942bv parseDelimitedFrom(C62942bv bvVar, InputStream inputStream) {
        C62942bv parsePartialDelimitedFrom = parsePartialDelimitedFrom(bvVar, inputStream, C62921ba.f169869a);
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    public static C62942bv parseFrom(C62942bv bvVar, C63088z zVar) {
        C62942bv parseFrom = parseFrom(bvVar, zVar, C62921ba.f169869a);
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    private static C62942bv parsePartialDelimitedFrom(C62942bv bvVar, InputStream inputStream, C62921ba baVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C62897ae M = C62897ae.m95110M(new C62881a(inputStream, C62897ae.m95108J(read, inputStream)));
            C62942bv parsePartialFrom = parsePartialFrom(bvVar, M, baVar);
            try {
                M.mo58658A(0);
                return parsePartialFrom;
            } catch (C62974ct e) {
                throw e;
            }
        } catch (C62974ct e2) {
            if (e2.f170012a) {
                throw new C62974ct((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new C62974ct(e3);
        }
    }

    private static C62942bv parsePartialFrom(C62942bv bvVar, C63088z zVar, C62921ba baVar) {
        C62897ae l = zVar.mo59040l();
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, l, baVar);
        try {
            l.mo58658A(0);
            return parsePartialFrom;
        } catch (C62974ct e) {
            throw e;
        }
    }

    protected static Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    protected static void registerDefaultInstance(Class cls, C62942bv bvVar) {
        defaultInstanceMap.put(cls, bvVar);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(C62941bu.BUILD_MESSAGE_INFO);
    }

    public final C62934bn createBuilder() {
        return (C62934bn) dynamicMethod(C62941bu.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(C62941bu buVar) {
        return dynamicMethod(buVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(C62941bu buVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C63013ee.f170090a.mo59017a(getClass()).mo59000j(this, (C62942bv) obj);
        }
        return false;
    }

    public final C62942bv getDefaultInstanceForType() {
        return (C62942bv) dynamicMethod(C62941bu.GET_DEFAULT_INSTANCE);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C63010eb getParserForType() {
        return (C63010eb) dynamicMethod(C62941bu.GET_PARSER);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int a = C63013ee.f170090a.mo59017a(getClass()).mo58992a(this);
        this.memoizedSerializedSize = a;
        return a;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int b = C63013ee.f170090a.mo59017a(getClass()).mo58993b(this);
        this.memoizedHashCode = b;
        return b;
    }

    public final boolean isInitialized() {
        return isInitialized(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: protected */
    public void makeImmutable() {
        C63013ee.f170090a.mo59017a(getClass()).mo58996f(this);
    }

    /* access modifiers changed from: protected */
    public void mergeLengthDelimitedField(int i, C63088z zVar) {
        ensureUnknownFieldsInitialized();
        C63045fj fjVar = this.unknownFields;
        fjVar.mo59106c();
        if (i != 0) {
            fjVar.mo59107d((i << 3) | 2, zVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: protected */
    public final void mergeUnknownFields(C63045fj fjVar) {
        this.unknownFields = C63045fj.m95891b(this.unknownFields, fjVar);
    }

    /* access modifiers changed from: protected */
    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C63045fj fjVar = this.unknownFields;
        fjVar.mo59106c();
        if (i != 0) {
            fjVar.mo59107d(i << 3, Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public C63005dx mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    public final C62934bn newBuilderForType() {
        return (C62934bn) dynamicMethod(C62941bu.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(int i, C62897ae aeVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo59108e(i, aeVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public final C62934bn toBuilder() {
        C62934bn bnVar = (C62934bn) dynamicMethod(C62941bu.NEW_BUILDER);
        bnVar.mergeFrom(this);
        return bnVar;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C63002du.m95613b(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C62906an anVar) {
        C63022en a = C63013ee.f170090a.mo59017a(getClass());
        C62907ao aoVar = anVar.f169853f;
        if (aoVar == null) {
            aoVar = new C62907ao(anVar);
        }
        a.mo59002m(this, aoVar);
    }

    protected static C62925be fieldInfo(Field field, int i, C62928bh bhVar, boolean z) {
        C62928bh bhVar2 = bhVar;
        if (field == null) {
            return null;
        }
        C62925be.m95395b(i);
        C62972cr.m95549i(field, "field");
        C62972cr.m95549i(bhVar2, "fieldType");
        if (bhVar2 != C62928bh.MESSAGE_LIST && bhVar2 != C62928bh.GROUP_LIST) {
            return new C62925be(field, i, bhVar, (Class) null, (Field) null, 0, false, z, (C63009ea) null, (Class) null, (Object) null, (C62959cf) null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    protected static final boolean isInitialized(C62942bv bvVar, boolean z) {
        byte byteValue = ((Byte) bvVar.dynamicMethod(C62941bu.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = C63013ee.f170090a.mo59017a(bvVar.getClass()).mo59001k(bvVar);
        if (z) {
            bvVar.dynamicMethod(C62941bu.SET_MEMOIZED_IS_INITIALIZED, true != k ? null : bvVar);
        }
        return k;
    }

    public static C62955cb mutableCopy(C62955cb cbVar) {
        int size = cbVar.size();
        return cbVar.mo58922d(size == 0 ? 10 : size + size);
    }

    protected static C62998dq newMessageInfo(C63012ed edVar, int[] iArr, Object[] objArr, Object obj) {
        return new C63039fd(edVar, false, iArr, (C62925be[]) objArr, obj);
    }

    public final C62934bn createBuilder(C62942bv bvVar) {
        return createBuilder().mergeFrom(bvVar);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(C62941bu buVar, Object obj) {
        return dynamicMethod(buVar, obj, (Object) null);
    }

    public static C62942bv parseFrom(C62942bv bvVar, C63088z zVar, C62921ba baVar) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, zVar, baVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static C62956cc mutableCopy(C62956cc ccVar) {
        int size = ccVar.size();
        return ccVar.mo58800f(size == 0 ? 10 : size + size);
    }

    public static C62942bv parseDelimitedFrom(C62942bv bvVar, InputStream inputStream, C62921ba baVar) {
        C62942bv parsePartialDelimitedFrom = parsePartialDelimitedFrom(bvVar, inputStream, baVar);
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    public static C62942bv parseFrom(C62942bv bvVar, C62897ae aeVar) {
        return parseFrom(bvVar, aeVar, C62921ba.f169869a);
    }

    public static C62942bv parseFrom(C62942bv bvVar, C62897ae aeVar, C62921ba baVar) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, aeVar, baVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    protected static C62942bv parsePartialFrom(C62942bv bvVar, C62897ae aeVar) {
        return parsePartialFrom(bvVar, aeVar, C62921ba.f169869a);
    }

    protected static C62925be fieldInfoForProto2Optional(Field field, long j, C62928bh bhVar, Field field2) {
        return fieldInfoForProto2Optional(field, (int) (j >>> 32), bhVar, field2, (int) j, false, (C62959cf) null);
    }

    protected static C62925be fieldInfoForProto2Required(Field field, long j, C62928bh bhVar, Field field2) {
        return fieldInfoForProto2Required(field, (int) (j >>> 32), bhVar, field2, (int) j, false, (C62959cf) null);
    }

    public static C62960cg mutableCopy(C62960cg cgVar) {
        int size = cgVar.size();
        return cgVar.mo58860f(size == 0 ? 10 : size + size);
    }

    public static C62942bv parseFrom(C62942bv bvVar, InputStream inputStream) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, C62897ae.m95110M(inputStream), C62921ba.f169869a);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    static C62942bv parsePartialFrom(C62942bv bvVar, C62897ae aeVar, C62921ba baVar) {
        C62942bv bvVar2 = (C62942bv) bvVar.dynamicMethod(C62941bu.NEW_MUTABLE_INSTANCE);
        try {
            C63022en a = C63013ee.f170090a.mo59017a(bvVar2.getClass());
            a.mo58998h(bvVar2, C62898af.m95150p(aeVar), baVar);
            a.mo58996f(bvVar2);
            return bvVar2;
        } catch (C62974ct e) {
            if (e.f170012a) {
                throw new C62974ct((IOException) e);
            }
            throw e;
        } catch (C63043fh e2) {
            throw e2.mo59085a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof C62974ct) {
                throw ((C62974ct) e3.getCause());
            }
            throw new C62974ct(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C62974ct) {
                throw ((C62974ct) e4.getCause());
            }
            throw e4;
        }
    }

    public static C62961ch mutableCopy(C62961ch chVar) {
        int size = chVar.size();
        return chVar.mo58915f(size == 0 ? 10 : size + size);
    }

    public static C62964ck mutableCopy(C62964ck ckVar) {
        int size = ckVar.size();
        return ckVar.mo58928d(size == 0 ? 10 : size + size);
    }

    public static C62942bv parseFrom(C62942bv bvVar, InputStream inputStream, C62921ba baVar) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, C62897ae.m95110M(inputStream), baVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static C62971cq mutableCopy(C62971cq cqVar) {
        int size = cqVar.size();
        return cqVar.mo58798e(size == 0 ? 10 : size + size);
    }

    public static C62942bv parseFrom(C62942bv bvVar, ByteBuffer byteBuffer) {
        return parseFrom(bvVar, byteBuffer, C62921ba.f169869a);
    }

    public static C62942bv parseFrom(C62942bv bvVar, ByteBuffer byteBuffer, C62921ba baVar) {
        C62942bv parseFrom = parseFrom(bvVar, C62897ae.m95111N(byteBuffer), baVar);
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    public static C62942bv parseFrom(C62942bv bvVar, byte[] bArr) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, bArr, 0, bArr.length, C62921ba.f169869a);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static C62942bv parseFrom(C62942bv bvVar, byte[] bArr, C62921ba baVar) {
        C62942bv parsePartialFrom = parsePartialFrom(bvVar, bArr, 0, bArr.length, baVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    /* access modifiers changed from: private */
    public static C62942bv parsePartialFrom(C62942bv bvVar, byte[] bArr, int i, int i2, C62921ba baVar) {
        C62942bv bvVar2 = (C62942bv) bvVar.dynamicMethod(C62941bu.NEW_MUTABLE_INSTANCE);
        try {
            C63022en a = C63013ee.f170090a.mo59017a(bvVar2.getClass());
            a.mo58999i(bvVar2, bArr, i, i + i2, new C63071i(baVar));
            a.mo58996f(bvVar2);
            if (bvVar2.memoizedHashCode == 0) {
                return bvVar2;
            }
            throw new RuntimeException();
        } catch (C62974ct e) {
            if (e.f170012a) {
                throw new C62974ct((IOException) e);
            }
            throw e;
        } catch (C63043fh e2) {
            throw e2.mo59085a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof C62974ct) {
                throw ((C62974ct) e3.getCause());
            }
            throw new C62974ct(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw C62974ct.m95559i();
        }
    }
}
