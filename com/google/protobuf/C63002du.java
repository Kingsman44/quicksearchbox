package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.protobuf.du */
/* compiled from: PG */
final class C63002du {
    /* renamed from: a */
    static final void m95612a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m95612a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                m95612a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C63040fe.m95870a(C63088z.m96143E((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C63088z) {
                sb.append(": \"");
                sb.append(C63040fe.m95870a((C63088z) obj));
                sb.append('\"');
            } else if (obj instanceof C62942bv) {
                sb.append(" {");
                m95613b((C62942bv) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m95612a(sb, i4, "key", entry.getKey());
                m95612a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: b */
    public static void m95613b(MessageLite messageLite, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : messageLite.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m95612a(sb, i, m95614c(concat), C62942bv.invokeOrDie(method2, messageLite, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m95612a(sb, i, m95614c(concat2), C62942bv.invokeOrDie(method3, messageLite, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(String.valueOf(substring)))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(String.valueOf(substring)));
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object invokeOrDie = C62942bv.invokeOrDie(method4, messageLite, new Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            if (!((Boolean) invokeOrDie).booleanValue()) {
                            }
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() == 0) {
                            }
                        } else if (invokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) invokeOrDie).floatValue()) == 0) {
                            }
                        } else if (!(invokeOrDie instanceof Double)) {
                            if (invokeOrDie instanceof String) {
                                z = invokeOrDie.equals(BuildConfig.FLAVOR);
                            } else if (invokeOrDie instanceof C63088z) {
                                z = invokeOrDie.equals(C63088z.f170246b);
                            } else if (invokeOrDie instanceof MessageLite) {
                                if (invokeOrDie == ((MessageLite) invokeOrDie).getDefaultInstanceForType()) {
                                }
                            } else if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) invokeOrDie).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C62942bv.invokeOrDie(method5, messageLite, new Object[0])).booleanValue()) {
                    }
                    m95612a(sb, i, m95614c(concat3), invokeOrDie);
                }
            }
        }
        if (messageLite instanceof C62937bq) {
            Iterator e = ((C62937bq) messageLite).f169962ag.mo58847e();
            while (e.hasNext()) {
                Map.Entry entry = (Map.Entry) e.next();
                m95612a(sb, i, "[" + ((C62939bs) entry.getKey()).f169964b + "]", entry.getValue());
            }
        }
        C63045fj fjVar = ((C62942bv) messageLite).unknownFields;
        if (fjVar != null) {
            for (int i2 = 0; i2 < fjVar.f170157b; i2++) {
                m95612a(sb, i, String.valueOf(fjVar.f170158c[i2] >>> 3), fjVar.f170159d[i2]);
            }
        }
    }

    /* renamed from: c */
    private static final String m95614c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
