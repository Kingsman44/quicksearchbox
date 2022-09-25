package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C1742a;
import androidx.constraintlayout.widget.C1745d;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* compiled from: PG */
public final class C1723h {

    /* renamed from: a */
    static final HashMap f5055a;

    /* renamed from: b */
    public HashMap f5056b = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f5055a = hashMap;
        try {
            hashMap.put("KeyAttribute", C1720e.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", C1725j.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", C1722g.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", C1728m.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", C1730o.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C1723h() {
    }

    /* renamed from: a */
    public final void mo4798a(C1733r rVar) {
        ArrayList arrayList = (ArrayList) this.f5056b.get(Integer.valueOf(rVar.f5140c));
        if (arrayList != null) {
            rVar.f5156s.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f5056b.get(-1);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C1718c cVar = (C1718c) arrayList2.get(i);
                String str = ((C1745d) rVar.f5139b.getLayoutParams()).f5256Y;
                String str2 = cVar.f5015c;
                if (!(str2 == null || str == null || !str.matches(str2))) {
                    rVar.f5156s.add(cVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo4799b(C1718c cVar) {
        if (!this.f5056b.containsKey(Integer.valueOf(cVar.f5014b))) {
            this.f5056b.put(Integer.valueOf(cVar.f5014b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f5056b.get(Integer.valueOf(cVar.f5014b));
        if (arrayList != null) {
            arrayList.add(cVar);
        }
    }

    public C1723h(Context context, XmlPullParser xmlPullParser) {
        HashMap hashMap;
        HashMap hashMap2;
        C1718c cVar;
        Exception e;
        try {
            int eventType = xmlPullParser.getEventType();
            C1718c cVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    HashMap hashMap3 = f5055a;
                    if (hashMap3.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) hashMap3.get(name);
                            if (constructor != null) {
                                cVar = (C1718c) constructor.newInstance(new Object[0]);
                                try {
                                    cVar.mo4795d(context, Xml.asAttributeSet(xmlPullParser));
                                    mo4799b(cVar);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                cVar2 = cVar;
                            } else {
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
                                sb.append("Keymaker for ");
                                sb.append(name);
                                sb.append(" not found");
                                throw new NullPointerException(sb.toString());
                            }
                        } catch (Exception e3) {
                            C1718c cVar3 = cVar2;
                            e = e3;
                            cVar = cVar3;
                            Log.e("KeyFrames", "unable to create ", e);
                            cVar2 = cVar;
                            eventType = xmlPullParser.next();
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(cVar2 == null || (hashMap2 = cVar2.f5017e) == null)) {
                            C1742a.m4755d(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || cVar2 == null || (hashMap = cVar2.f5017e) == null)) {
                        C1742a.m4755d(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
