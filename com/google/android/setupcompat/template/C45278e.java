package com.google.android.setupcompat.template;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.setupcompat.template.e */
/* compiled from: PG */
final class C45278e {
    /* renamed from: a */
    public static final C45277d m80678a(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return m80679b(xml, context);
        } finally {
            xml.close();
        }
    }

    /* renamed from: b */
    private static final C45277d m80679b(XmlPullParser xmlPullParser, Context context) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 1) {
                        String positionDescription = xmlPullParser.getPositionDescription();
                        throw new InflateException(positionDescription + ": No start tag found!");
                    }
                } else if (xmlPullParser.getName().equals("FooterButton")) {
                    return new C45277d(context, asAttributeSet);
                } else {
                    String positionDescription2 = xmlPullParser.getPositionDescription();
                    throw new InflateException(positionDescription2 + ": not a FooterButton");
                }
            } catch (XmlPullParserException e) {
                throw new InflateException(e.getMessage(), e);
            } catch (IOException e2) {
                String positionDescription3 = xmlPullParser.getPositionDescription();
                String message = e2.getMessage();
                throw new InflateException(positionDescription3 + ": " + message, e2);
            }
        }
    }
}
