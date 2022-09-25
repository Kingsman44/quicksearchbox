package com.google.research.p5181a.p5182a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.research.a.a.r */
/* compiled from: PG */
public final class C66295r {
    /* renamed from: a */
    public static Object m96860a(DataInputStream dataInputStream, Class cls) {
        if (cls == Integer.class) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (cls == Long.class) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (cls == Float.class) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (cls == String.class) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (cls == int[].class) {
            int readInt = dataInputStream.readInt();
            int[] iArr = new int[readInt];
            while (i < readInt) {
                iArr[i] = dataInputStream.readInt();
                i++;
            }
            return iArr;
        } else if (cls != float[].class) {
            return null;
        } else {
            int readInt2 = dataInputStream.readInt();
            float[] fArr = new float[readInt2];
            while (i < readInt2) {
                fArr[i] = dataInputStream.readFloat();
                i++;
            }
            return fArr;
        }
    }

    /* renamed from: b */
    public static HashMap m96861b(DataInputStream dataInputStream, Class cls, Class cls2) {
        HashMap hashMap = new HashMap();
        int readInt = dataInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(m96860a(dataInputStream, cls), m96860a(dataInputStream, cls2));
        }
        return hashMap;
    }

    /* renamed from: c */
    public static void m96862c(DataOutputStream dataOutputStream, Map map) {
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            m96863d(dataOutputStream, entry.getKey());
            m96863d(dataOutputStream, entry.getValue());
        }
    }

    /* renamed from: d */
    public static void m96863d(DataOutputStream dataOutputStream, Object obj) {
        if (obj instanceof Integer) {
            dataOutputStream.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof HashMap) {
            m96862c(dataOutputStream, (HashMap) obj);
        } else {
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                dataOutputStream.writeInt(iArr.length);
                while (i < iArr.length) {
                    dataOutputStream.writeInt(iArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                dataOutputStream.writeInt(fArr.length);
                while (i < fArr.length) {
                    dataOutputStream.writeFloat(fArr[i]);
                    i++;
                }
            }
        }
    }
}
