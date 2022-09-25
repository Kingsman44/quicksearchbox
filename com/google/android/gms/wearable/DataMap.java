package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.wearable.p10888a.C146406b;
import com.google.android.gms.wearable.p10888a.p10889a.C146396a;
import com.google.android.gms.wearable.p10888a.p10889a.C146397b;
import com.google.android.gms.wearable.p10888a.p10889a.C146403h;
import com.google.android.gms.wearable.p10888a.p10889a.C146404i;
import com.google.android.gms.wearable.p10888a.p10889a.C146405j;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
public class DataMap {

    /* renamed from: a */
    private final HashMap f395477a = new HashMap();

    /* renamed from: a */
    private static int m238326a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj != null) {
                if (obj instanceof Integer) {
                    return 2;
                }
                if (obj instanceof String) {
                    return 3;
                }
                if (obj instanceof DataMap) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    public static ArrayList arrayListFromBundleArrayList(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(fromBundle((Bundle) arrayList.get(i)));
        }
        return arrayList2;
    }

    /* renamed from: b */
    private static final void m238327b(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public static DataMap fromBundle(Bundle bundle) {
        ClassLoader classLoader = Asset.class.getClassLoader();
        C143919bh.m233958a(classLoader);
        bundle.setClassLoader(classLoader);
        DataMap dataMap = new DataMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                dataMap.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                dataMap.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                dataMap.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                dataMap.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                dataMap.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                dataMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataMap.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                dataMap.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                dataMap.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                dataMap.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                dataMap.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                dataMap.putAsset(str, (Asset) obj);
            } else if (obj instanceof Bundle) {
                dataMap.putDataMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int a = m238326a(arrayList);
                if (a == 0) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (a == 1) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (a == 2) {
                    dataMap.putIntegerArrayList(str, arrayList);
                } else if (a == 3) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (a == 5) {
                    dataMap.putDataMapArrayList(str, arrayListFromBundleArrayList(arrayList));
                }
            }
        }
        return dataMap;
    }

    public static DataMap fromByteArray(byte[] bArr) {
        try {
            ArrayList arrayList = new ArrayList();
            DataMap dataMap = new DataMap();
            for (C146404i iVar : ((C146405j) C62942bv.parseFrom((C62942bv) C146405j.f395514b, bArr)).f395516a) {
                String str = iVar.f395511b;
                C146403h hVar = iVar.f395512c;
                if (hVar == null) {
                    hVar = C146403h.f395502d;
                }
                C146406b.m238335b(arrayList, dataMap, str, hVar);
            }
            return dataMap;
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public void clear() {
        this.f395477a.clear();
    }

    public boolean containsKey(String str) {
        return this.f395477a.containsKey(str);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof DataMap)) {
            return false;
        }
        DataMap dataMap = (DataMap) obj;
        if (size() != dataMap.size()) {
            return false;
        }
        for (String str : keySet()) {
            Object obj2 = get(str);
            Object obj3 = dataMap.get(str);
            if (obj2 instanceof Asset) {
                if (!(obj3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj2;
                Asset asset2 = (Asset) obj3;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.f395462b)) {
                        String str2 = asset.f395462b;
                        C143919bh.m233958a(str2);
                        z = str2.equals(asset2.f395462b);
                    } else {
                        z = Arrays.equals(asset.f395461a, asset2.f395461a);
                    }
                    if (!z) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (obj2 instanceof String[]) {
                if (!(obj3 instanceof String[]) || !Arrays.equals((String[]) obj2, (String[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof long[]) {
                if (!(obj3 instanceof long[]) || !Arrays.equals((long[]) obj2, (long[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof float[]) {
                if (!(obj3 instanceof float[]) || !Arrays.equals((float[]) obj2, (float[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else if (!C143912ba.m233950b(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public Object get(String str) {
        return this.f395477a.get(str);
    }

    public Asset getAsset(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "Asset", "<null>", e);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0);
    }

    public byte[] getByteArray(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "byte[]", "<null>", e);
            return null;
        }
    }

    public DataMap getDataMap(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataMap) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "DataMap", "<null>", e);
            return null;
        }
    }

    public ArrayList getDataMapArrayList(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "ArrayList<DataMap>", "<null>", e);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, C59203do.f157270a);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "float[]", "<null>", e);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public ArrayList getIntegerArrayList(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "ArrayList<Integer>", "<null>", e);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "long[]", "<null>", e);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "String", "<null>", e);
            return null;
        }
    }

    public String[] getStringArray(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "String[]", "<null>", e);
            return null;
        }
    }

    public ArrayList getStringArrayList(String str) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m238327b(str, obj, "ArrayList<String>", "<null>", e);
            return null;
        }
    }

    public int hashCode() {
        return this.f395477a.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.f395477a.isEmpty();
    }

    public Set keySet() {
        return this.f395477a.keySet();
    }

    public void putAll(DataMap dataMap) {
        for (String str : dataMap.keySet()) {
            this.f395477a.put(str, dataMap.get(str));
        }
    }

    public void putAsset(String str, Asset asset) {
        this.f395477a.put(str, asset);
    }

    public void putBoolean(String str, boolean z) {
        this.f395477a.put(str, Boolean.valueOf(z));
    }

    public void putByte(String str, byte b) {
        this.f395477a.put(str, Byte.valueOf(b));
    }

    public void putByteArray(String str, byte[] bArr) {
        this.f395477a.put(str, bArr);
    }

    public void putDataMap(String str, DataMap dataMap) {
        this.f395477a.put(str, dataMap);
    }

    public void putDataMapArrayList(String str, ArrayList arrayList) {
        this.f395477a.put(str, arrayList);
    }

    public void putDouble(String str, double d) {
        this.f395477a.put(str, Double.valueOf(d));
    }

    public void putFloat(String str, float f) {
        this.f395477a.put(str, Float.valueOf(f));
    }

    public void putFloatArray(String str, float[] fArr) {
        this.f395477a.put(str, fArr);
    }

    public void putInt(String str, int i) {
        this.f395477a.put(str, Integer.valueOf(i));
    }

    public void putIntegerArrayList(String str, ArrayList arrayList) {
        this.f395477a.put(str, arrayList);
    }

    public void putLong(String str, long j) {
        this.f395477a.put(str, Long.valueOf(j));
    }

    public void putLongArray(String str, long[] jArr) {
        this.f395477a.put(str, jArr);
    }

    public void putString(String str, String str2) {
        this.f395477a.put(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.f395477a.put(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList arrayList) {
        this.f395477a.put(str, arrayList);
    }

    public Object remove(String str) {
        return this.f395477a.remove(str);
    }

    public int size() {
        return this.f395477a.size();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (String str : this.f395477a.keySet()) {
            Object obj = this.f395477a.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                bundle.putParcelable(str, (Asset) obj);
            } else if (obj instanceof DataMap) {
                bundle.putParcelable(str, ((DataMap) obj).toBundle());
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int a = m238326a(arrayList);
                if (a == 0) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (a == 1) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (a == 2) {
                    bundle.putIntegerArrayList(str, arrayList);
                } else if (a == 3) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (a == 4) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(((DataMap) arrayList.get(i)).toBundle());
                    }
                    bundle.putParcelableArrayList(str, arrayList2);
                }
            }
        }
        return bundle;
    }

    public byte[] toByteArray() {
        ArrayList arrayList = new ArrayList();
        C146396a aVar = (C146396a) C146405j.f395514b.createBuilder();
        TreeSet treeSet = new TreeSet(keySet());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = get(str);
            C146397b bVar = (C146397b) C146404i.f395508d.createBuilder();
            bVar.copyOnWrite();
            C146404i iVar = (C146404i) bVar.instance;
            str.getClass();
            iVar.f395510a |= 1;
            iVar.f395511b = str;
            C146403h a = C146406b.m238334a(arrayList, obj);
            bVar.copyOnWrite();
            C146404i iVar2 = (C146404i) bVar.instance;
            a.getClass();
            iVar2.f395512c = a;
            iVar2.f395510a |= 2;
            arrayList2.add((C146404i) bVar.build());
        }
        aVar.copyOnWrite();
        C146405j jVar = (C146405j) aVar.instance;
        C62971cq cqVar = jVar.f395516a;
        if (!cqVar.mo58948c()) {
            jVar.f395516a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList2, (List) jVar.f395516a);
        return ((C146405j) aVar.build()).toByteArray();
    }

    public String toString() {
        return this.f395477a.toString();
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public byte getByte(String str, byte b) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return b;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "Byte", Byte.valueOf(b), e);
            return b;
        }
    }

    public double getDouble(String str, double d) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public int getInt(String str, int i) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "Integer", "<null>", e);
            return i;
        }
    }

    public long getLong(String str, long j) {
        Object obj = this.f395477a.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            m238327b(str, obj, "long", "<null>", e);
            return j;
        }
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }
}
