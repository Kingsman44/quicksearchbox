package com.evernote.android.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
public final class InjectionHelper {
    private final String mBaseKey;
    private final Map mBundlers;

    public InjectionHelper(String str, Map map) {
        this.mBaseKey = str;
        this.mBundlers = map;
    }

    public boolean getBoolean(Bundle bundle, String str) {
        return bundle.getBoolean(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public boolean[] getBooleanArray(Bundle bundle, String str) {
        return bundle.getBooleanArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public Boolean getBoxedBoolean(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Boolean.valueOf(bundle.getBoolean(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Byte getBoxedByte(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Byte.valueOf(bundle.getByte(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Character getBoxedChar(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Character.valueOf(bundle.getChar(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Double getBoxedDouble(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Double.valueOf(bundle.getDouble(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Float getBoxedFloat(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Float.valueOf(bundle.getFloat(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Integer getBoxedInt(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Integer.valueOf(bundle.getInt(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Long getBoxedLong(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Long.valueOf(bundle.getLong(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Short getBoxedShort(Bundle bundle, String str) {
        if (bundle.containsKey(String.valueOf(str).concat(String.valueOf(this.mBaseKey)))) {
            return Short.valueOf(bundle.getShort(String.valueOf(str).concat(String.valueOf(this.mBaseKey))));
        }
        return null;
    }

    public Bundle getBundle(Bundle bundle, String str) {
        return bundle.getBundle(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public byte getByte(Bundle bundle, String str) {
        return bundle.getByte(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public byte[] getByteArray(Bundle bundle, String str) {
        return bundle.getByteArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public char getChar(Bundle bundle, String str) {
        return bundle.getChar(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public char[] getCharArray(Bundle bundle, String str) {
        return bundle.getCharArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public CharSequence getCharSequence(Bundle bundle, String str) {
        return bundle.getCharSequence(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public CharSequence[] getCharSequenceArray(Bundle bundle, String str) {
        return bundle.getCharSequenceArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public ArrayList getCharSequenceArrayList(Bundle bundle, String str) {
        return bundle.getCharSequenceArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public double getDouble(Bundle bundle, String str) {
        return bundle.getDouble(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public double[] getDoubleArray(Bundle bundle, String str) {
        return bundle.getDoubleArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public float getFloat(Bundle bundle, String str) {
        return bundle.getFloat(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public float[] getFloatArray(Bundle bundle, String str) {
        return bundle.getFloatArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public int getInt(Bundle bundle, String str) {
        return bundle.getInt(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public int[] getIntArray(Bundle bundle, String str) {
        return bundle.getIntArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public ArrayList getIntegerArrayList(Bundle bundle, String str) {
        return bundle.getIntegerArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public long getLong(Bundle bundle, String str) {
        return bundle.getLong(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public long[] getLongArray(Bundle bundle, String str) {
        return bundle.getLongArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public Parcelable getParcelable(Bundle bundle, String str) {
        return bundle.getParcelable(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public Parcelable[] getParcelableArray(Bundle bundle, String str) {
        return bundle.getParcelableArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public ArrayList getParcelableArrayList(Bundle bundle, String str) {
        return bundle.getParcelableArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public Parcelable getParent(Bundle bundle) {
        return bundle.getParcelable(String.valueOf(this.mBaseKey).concat("$$SUPER"));
    }

    public Serializable getSerializable(Bundle bundle, String str) {
        return bundle.getSerializable(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public short getShort(Bundle bundle, String str) {
        return bundle.getShort(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public short[] getShortArray(Bundle bundle, String str) {
        return bundle.getShortArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public SparseArray getSparseParcelableArray(Bundle bundle, String str) {
        return bundle.getSparseParcelableArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public String getString(Bundle bundle, String str) {
        return bundle.getString(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public String[] getStringArray(Bundle bundle, String str) {
        return bundle.getStringArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public ArrayList getStringArrayList(Bundle bundle, String str) {
        return bundle.getStringArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)));
    }

    public Object getWithBundler(Bundle bundle, String str) {
        return ((Bundler) this.mBundlers.get(str)).get(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), bundle);
    }

    public void putBoolean(Bundle bundle, String str, boolean z) {
        bundle.putBoolean(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), z);
    }

    public void putBooleanArray(Bundle bundle, String str, boolean[] zArr) {
        bundle.putBooleanArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), zArr);
    }

    public void putBoxedBoolean(Bundle bundle, String str, Boolean bool) {
        if (bool != null) {
            bundle.putBoolean(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), bool.booleanValue());
        }
    }

    public void putBoxedByte(Bundle bundle, String str, Byte b) {
        if (b != null) {
            bundle.putByte(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), b.byteValue());
        }
    }

    public void putBoxedChar(Bundle bundle, String str, Character ch) {
        if (ch != null) {
            bundle.putChar(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), ch.charValue());
        }
    }

    public void putBoxedDouble(Bundle bundle, String str, Double d) {
        if (d != null) {
            bundle.putDouble(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), d.doubleValue());
        }
    }

    public void putBoxedFloat(Bundle bundle, String str, Float f) {
        if (f != null) {
            bundle.putFloat(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), f.floatValue());
        }
    }

    public void putBoxedInt(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), num.intValue());
        }
    }

    public void putBoxedLong(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), l.longValue());
        }
    }

    public void putBoxedShort(Bundle bundle, String str, Short sh) {
        if (sh != null) {
            bundle.putShort(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), sh.shortValue());
        }
    }

    public void putBundle(Bundle bundle, String str, Bundle bundle2) {
        bundle.putBundle(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), bundle2);
    }

    public void putByte(Bundle bundle, String str, byte b) {
        bundle.putByte(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), b);
    }

    public void putByteArray(Bundle bundle, String str, byte[] bArr) {
        bundle.putByteArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), bArr);
    }

    public void putChar(Bundle bundle, String str, char c) {
        bundle.putChar(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), c);
    }

    public void putCharArray(Bundle bundle, String str, char[] cArr) {
        bundle.putCharArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), cArr);
    }

    public void putCharSequence(Bundle bundle, String str, CharSequence charSequence) {
        bundle.putCharSequence(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), charSequence);
    }

    public void putCharSequenceArray(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        bundle.putCharSequenceArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), charSequenceArr);
    }

    public void putCharSequenceArrayList(Bundle bundle, String str, ArrayList arrayList) {
        bundle.putCharSequenceArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), arrayList);
    }

    public void putDouble(Bundle bundle, String str, double d) {
        bundle.putDouble(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), d);
    }

    public void putDoubleArray(Bundle bundle, String str, double[] dArr) {
        bundle.putDoubleArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), dArr);
    }

    public void putFloat(Bundle bundle, String str, float f) {
        bundle.putFloat(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), f);
    }

    public void putFloatArray(Bundle bundle, String str, float[] fArr) {
        bundle.putFloatArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), fArr);
    }

    public void putInt(Bundle bundle, String str, int i) {
        bundle.putInt(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), i);
    }

    public void putIntArray(Bundle bundle, String str, int[] iArr) {
        bundle.putIntArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), iArr);
    }

    public void putIntegerArrayList(Bundle bundle, String str, ArrayList arrayList) {
        bundle.putIntegerArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), arrayList);
    }

    public void putLong(Bundle bundle, String str, long j) {
        bundle.putLong(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), j);
    }

    public void putLongArray(Bundle bundle, String str, long[] jArr) {
        bundle.putLongArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), jArr);
    }

    public void putParcelable(Bundle bundle, String str, Parcelable parcelable) {
        bundle.putParcelable(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), parcelable);
    }

    public void putParcelableArray(Bundle bundle, String str, Parcelable[] parcelableArr) {
        bundle.putParcelableArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), parcelableArr);
    }

    public void putParcelableArrayList(Bundle bundle, String str, ArrayList arrayList) {
        bundle.putParcelableArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), arrayList);
    }

    public Bundle putParent(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        if (parcelable != null) {
            bundle.putParcelable(String.valueOf(this.mBaseKey).concat("$$SUPER"), parcelable);
        }
        return bundle;
    }

    public void putSerializable(Bundle bundle, String str, Serializable serializable) {
        bundle.putSerializable(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), serializable);
    }

    public void putShort(Bundle bundle, String str, short s) {
        bundle.putShort(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), s);
    }

    public void putShortArray(Bundle bundle, String str, short[] sArr) {
        bundle.putShortArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), sArr);
    }

    public void putSparseParcelableArray(Bundle bundle, String str, SparseArray sparseArray) {
        bundle.putSparseParcelableArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), sparseArray);
    }

    public void putString(Bundle bundle, String str, String str2) {
        bundle.putString(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), str2);
    }

    public void putStringArray(Bundle bundle, String str, String[] strArr) {
        bundle.putStringArray(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), strArr);
    }

    public void putStringArrayList(Bundle bundle, String str, ArrayList arrayList) {
        bundle.putStringArrayList(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), arrayList);
    }

    public void putWithBundler(Bundle bundle, String str, Object obj) {
        if (obj != null) {
            ((Bundler) this.mBundlers.get(str)).put(String.valueOf(str).concat(String.valueOf(this.mBaseKey)), obj, bundle);
        }
    }
}
